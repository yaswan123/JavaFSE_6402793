package WEEK1_DesignPrinciplesAndPatterns.S1_SingletonPatternExample.Codes;
public class LoggerTest {
    public static void main(String[] args) 
    {
        Logger log1 = Logger.getLogger();
        Logger log2 = Logger.getLogger();
        log1.write("User login event logged.");
        log2.write("Data sync event logged.");
        if (log1 == log2) 
        {
            System.out.println("Test passed: Only one Logger instance exists.");
        } 
        else 
        {
            System.out.println("Test failed: Multiple Logger instances exist.");
        }
    }
}

