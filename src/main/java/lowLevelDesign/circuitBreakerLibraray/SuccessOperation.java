package lowLevelDesign.circuitBreakerLibraray;

public class SuccessOperation implements Operation {
    @Override
    public String execute() throws Exception {

        if (Math.random() > 0.5) {
            throw new RuntimeException("Operation failed !");

        }
        return "Success !";
    }
}
