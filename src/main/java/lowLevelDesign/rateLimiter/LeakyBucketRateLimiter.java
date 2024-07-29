package lowLevelDesign.rateLimiter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucketRateLimiter implements RateLimiter {

    int capacity;
    HashMap<String, BlockingQueue<Request>> map;
    private long lastLeakTime;
    private long leakIntervalMillis;

    LeakyBucketRateLimiter(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    @Override
    public boolean isRequestAllowed(String key, Request request) {
        BlockingQueue<Request> queue = map.get(key);
        if (queue == null) {
            queue = new LinkedBlockingQueue<Request>(capacity);
            queue.add(request);
            return true;
        }

        if (queue.remainingCapacity() > 0) {
            queue.add(request);
            return true;
        }

        // rate limit
        return false;
    }

    private void performLeakage() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastLeakTime >= leakIntervalMillis) {
            // Iterate through all queues and remove one request from each
            Iterator<Map.Entry<String, BlockingQueue<Request>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, BlockingQueue<Request>> entry = iterator.next();
                BlockingQueue<Request> queue = entry.getValue();
                if (queue != null && !queue.isEmpty()) {
                    queue.poll(); // Remove one request from the queue
                    if (queue.isEmpty()) {
                        iterator.remove(); // Remove the queue if empty
                    }
                }
            }
            lastLeakTime = currentTime; // Update last leakage time
        }
    }
}
