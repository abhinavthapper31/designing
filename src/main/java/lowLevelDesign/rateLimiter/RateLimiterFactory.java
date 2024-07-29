package lowLevelDesign.rateLimiter;

public class RateLimiterFactory {

    int DEFAULT_LEAKY_BUCKET_CAP = 5;
    int DEFAULT_TOKEN_BUCKET_CAP = 5;


    RateLimiter getRateLimiter(String type) {
        switch (type) {
            case "LEAKY_BUCKET":
                return new LeakyBucketRateLimiter(DEFAULT_LEAKY_BUCKET_CAP);
            case "TOKEN_BUCKET":
                return new TokenBucketRateLimiter(DEFAULT_TOKEN_BUCKET_CAP);
            case "ROLLING_WINDOW_COOLDOWN":
                return new RollingWindowRateLimiter();
        }
        return null;
    }
}
