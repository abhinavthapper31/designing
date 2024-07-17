package lowLevelDesign.rateLimiter;

public class TokenBucket {


    int tokenCount;
    long lastConsumedAt;
    long lastRefilledAt;

    TokenBucket(int maxTokenCount) {
        this.tokenCount = maxTokenCount;
        lastConsumedAt = 0;
        lastRefilledAt = 0;
    }

    public int getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(int tokenCount) {
        this.tokenCount = tokenCount;
    }

    public long getLastConsumedAt() {
        return lastConsumedAt;
    }

    public void setLastConsumedAt(long lastConsumedAt) {
        this.lastConsumedAt = lastConsumedAt;
    }

    public long getLastRefilledAt() {
        return lastRefilledAt;
    }

    public void setLastRefilledAt(long lastRefilledAt) {
        this.lastRefilledAt = lastRefilledAt;
    }
}
