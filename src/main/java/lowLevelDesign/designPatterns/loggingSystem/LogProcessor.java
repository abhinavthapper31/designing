package lowLevelDesign.designPatterns.loggingSystem;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;


    private LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextProcessor) {
        this.nextLogProcessor = nextProcessor;
    }

    public void log(int level, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(level, message);
        }
    }
}
