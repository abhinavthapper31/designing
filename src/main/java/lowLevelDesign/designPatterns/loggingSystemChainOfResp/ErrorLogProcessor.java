package lowLevelDesign.designPatterns.loggingSystemChainOfResp;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == LogProcessor.ERROR) {
            // log it
            System.out.println("ERROR : " + message);
        } else {
            super.log(level, message);
        }
    }
}
