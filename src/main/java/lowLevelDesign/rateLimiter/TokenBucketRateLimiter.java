package lowLevelDesign.rateLimiter;

import java.util.HashMap;
import java.util.Map;

public class TokenBucketRateLimiter implements RateLimiter {

    Map<String, TokenBucket> map = new HashMap<>();
    int tokenPerBucket;
    long refillInterval;
    int refillRate;

    TokenBucketRateLimiter() {
        tokenPerBucket = 5;
        this.refillInterval = 1000 * 6l;
        refillRate = 1;
    }


    @Override
    public boolean isRequestAllow(String key, Request request) {
        TokenBucket bucket = map.get(key);
        if (bucket == null) {
            TokenBucket newBucket = new TokenBucket(tokenPerBucket - 1);
            newBucket.setLastConsumedAt(System.currentTimeMillis());
            map.put(key, newBucket);
            return true;
        }

        int currentTokenCount = bucket.getTokenCount();
        if (currentTokenCount == 0) {
            // rate limit
            return false;
        }
        bucket.setTokenCount(bucket.getTokenCount() - 1);
        bucket.setLastConsumedAt(System.currentTimeMillis());
        map.put(key, bucket);
        return true;
    }

    // called by separate thread itself.
    public synchronized void refillBuckets() {
        long currentTime = System.currentTimeMillis();
        for (TokenBucket bucket : map.values()) {
            long elapsedTime = currentTime - bucket.getLastConsumedAt();
            // only update is refill interval has crossed.
            if (elapsedTime > refillInterval) {
                double tokensToAdd = elapsedTime * refillRate;
                int newTokens = (int) Math.min(tokenPerBucket, bucket.getTokenCount() + tokensToAdd);
                bucket.setTokenCount(newTokens);
                bucket.setLastRefilledAt(currentTime);
            }
        }
    }
}
