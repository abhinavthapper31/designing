package lowLevelDesign.designPatterns.loggingSystemChainOfResp;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == LogProcessor.INFO) {
            // log it
            System.out.println("INFO : " + message);
        } else {
            super.log(level, message);
        }
    }
}
