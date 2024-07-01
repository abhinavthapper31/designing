package lowLevelDesign.loggingSystem;


public class App {

    // Chain of Responsibility Pattern (The person who requests, is not concerned with who fulfills req) :
    // Design logging, Design vending machine
    // design ATM
    public static void main(String args[]) {

        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR, "Exception log");
        logger.log(LogProcessor.DEBUG, "Debug log");
        logger.log(LogProcessor.INFO, "Info log");

    }
}
