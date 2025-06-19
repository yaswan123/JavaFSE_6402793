package WEEK1_DesignPrinciplesAndPatterns.S1_SingletonPatternExample.Codes;
public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger system started.");
    }
    public static Logger getLogger() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void write(String message) {
        System.out.println(">> " + message);
    }
}

