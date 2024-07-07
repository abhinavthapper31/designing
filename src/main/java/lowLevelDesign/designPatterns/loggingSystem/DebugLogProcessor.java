package lowLevelDesign.designPatterns.loggingSystem;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == LogProcessor.DEBUG) {
            // log it
            System.out.println("DEBUG : " + message);
        } else {
            super.log(level, message);
        }
    }

}
