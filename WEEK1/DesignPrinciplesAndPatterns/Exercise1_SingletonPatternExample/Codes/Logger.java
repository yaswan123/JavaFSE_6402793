package WEEK1.DesignPrinciplesAndPatterns.Exercise1_SingletonPatternExample.Codes;
 class Logger {
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
    public void write(String message) 
    {
        System.out.println(">> " + message);
    }
}

