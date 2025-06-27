// Logger.java
public class Logger {

    // Step 1: Private static instance (eager or lazy initialization)
    private static Logger instance = null;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create instance if not created yet
        }
        return instance;
    }

    // A sample log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
