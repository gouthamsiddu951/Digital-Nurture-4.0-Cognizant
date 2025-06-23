// TestLogger.java
public class TestLogger {
    public static void main(String[] args) {

        // Fetch Logger instance multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        // Log a message
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if all instances are the same
        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Only one Logger instance is used.");
        } else {
            System.out.println("Different Logger instances exist.");
        }
    }
}
