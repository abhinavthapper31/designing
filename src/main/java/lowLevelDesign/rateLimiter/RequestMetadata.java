package lowLevelDesign.rateLimiter;

public class RequestMetadata {
    int requestCount;
    long lastRequestedAt;

    public RequestMetadata(int requestCount, long lastRequestedAt) {
        this.requestCount = requestCount;
        this.lastRequestedAt = lastRequestedAt;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }

    public long getLastRequestedAt() {
        return lastRequestedAt;
    }

    public void setLastRequestedAt(long lastRequestedAt) {
        this.lastRequestedAt = lastRequestedAt;
    }
}
