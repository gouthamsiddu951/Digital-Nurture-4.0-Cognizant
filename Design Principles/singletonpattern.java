// SingletonPatternExample.java
public class singletonpattern {

    // Singleton Logger class
    static class Logger {
        // Private static instance of Logger
        private static Logger instance;

        // Private constructor to prevent instantiation
        private Logger() {
            System.out.println("Logger initialized.");
        }

        // Public static method to get the single instance
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Example logging method
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    // Main method to test the Singleton
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Continuing application...");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}
