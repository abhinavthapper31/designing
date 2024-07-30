package lowLevelDesign.circuitBreakerLibrary;

public class SimpleCircuitBreaker {
    private State state = State.CLOSED;
    private int failureCount = 0;
    private long lastFailureTime;

    private final int failureThreshold;
    private final long timeout;
    private final int maxRetries;

    public SimpleCircuitBreaker(int failureThreshold, long timeout, int maxRetries) {
        this.failureThreshold = failureThreshold;
        this.timeout = timeout;
        this.maxRetries = maxRetries;
    }

    public synchronized String execute(Operation primary) {
        switch (state) {
            case OPEN:
                if (System.currentTimeMillis() - lastFailureTime > timeout) {
                    state = State.HALF_OPEN;
                } else {
                    return "Circuit is OPEN. Skipping operation.";
                }
                break;
            case HALF_OPEN:
            case CLOSED:
                return attemptExecution(primary);
        }
        return "Unexpected state";
    }

    private String attemptExecution(Operation primary) {
        int retries = 0;
        while (retries < maxRetries) {
            try {
                String result = primary.execute();
                reset();
                return result;
            } catch (Exception e) {
                System.out.println("Exception occurred ! Retrying");
                retries++;
                if (retries >= maxRetries) {
                    failureCount++;
                    if (failureCount >= failureThreshold) {
                        System.out.println("Failure threshold crossed ! Breaking circuit");
                        state = State.OPEN;
                        lastFailureTime = System.currentTimeMillis();
                    }
                }
            }
        }
        return "Operation failed after retries.";
    }

    private void reset() {
        failureCount = 0;
        state = State.CLOSED;
    }

    public static void main(String[] args) {
        SimpleCircuitBreaker circuitBreaker = new SimpleCircuitBreaker(1, 5000, 3); // Threshold: 3 failures, Timeout: 5000ms, Retries: 3
        Operation operation = new SuccessOperation();
        for (int i = 0; i < 10; i++) {
            System.out.println("Execution number " + i );
            String result = circuitBreaker.execute(operation);
            System.out.println(result);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
