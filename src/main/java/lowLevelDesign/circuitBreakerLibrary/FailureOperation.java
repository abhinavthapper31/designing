package lowLevelDesign.circuitBreakerLibrary;

public class FailureOperation implements Operation {
    @Override
    public String execute() throws Exception {
        throw new RuntimeException("Operation failed !");
    }
}
