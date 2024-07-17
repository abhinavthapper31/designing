package lowLevelDesign.rateLimiter;

public interface RateLimiter {
    boolean isRequestAllow(String key,Request req);
}
