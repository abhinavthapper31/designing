package lowLevelDesign.rateLimiter;

import java.util.HashMap;
import java.util.Map;

public class RollingWindowRateLimiter implements RateLimiter {

    private static final long WINDOW_SIZE_MILLIS = 0l;
    private static final int REQUEST_LIMIT = 10;
    private static final long COOLDOWN_PERIOD_MILLIS = 1000;
    Map<String, RequestMetadata> clientRequestMap;

    RollingWindowRateLimiter() {
        clientRequestMap = new HashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String key, Request req) {
        RequestMetadata stats = clientRequestMap.get(key);
        long now = System.currentTimeMillis();

        if (stats == null) {
            stats = new RequestMetadata(1, now);
            clientRequestMap.put(key, stats);
            return true;
        }

        // Check if within the rolling window (e.g., last 1 minute)
        if (now - stats.getLastRequestedAt() > WINDOW_SIZE_MILLIS) {
            // Reset the window if it has elapsed
            stats.setLastRequestedAt(now);
            stats.setRequestCount(1);
            return true;
        } else {
            if (stats.getRequestCount() < REQUEST_LIMIT) {
                stats.setRequestCount(stats.getRequestCount() + 1);
                return true;
            } else {
                if (now - stats.getLastRequestedAt() < COOLDOWN_PERIOD_MILLIS) {
                    // rate limtit
                    return false;
                } else {
                    stats.setLastRequestedAt(now);
                    stats.setRequestCount(1);
                    return true;
                }
            }
        }
    }

}
