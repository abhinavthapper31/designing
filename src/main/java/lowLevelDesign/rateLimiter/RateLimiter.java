package lowLevelDesign.rateLimiter;

public interface RateLimiter {
    boolean isRequestAllowed(String key, Request req);
}
