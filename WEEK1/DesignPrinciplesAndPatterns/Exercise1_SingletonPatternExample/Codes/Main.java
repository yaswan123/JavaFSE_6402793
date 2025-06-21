package WEEK1.DesignPrinciplesAndPatterns.Exercise1_SingletonPatternExample.Codes;
public class Main {
    public static void main(String[] args) {
        Logger appLogger = Logger.getLogger();
        appLogger.write("Initializing application...");
        Logger errorLogger = Logger.getLogger();
        errorLogger.write("Loading configuration...");
        if (appLogger == errorLogger) {
            System.out.println("Logger is shared across modules.");
        } 
        else {
            System.out.println("Different logger instances found.");
        }
    }
}
