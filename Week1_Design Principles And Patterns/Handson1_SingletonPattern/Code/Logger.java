// Logger class following Singleton Pattern
public class Logger{
    // Private static instance
    private static Logger instance;

    // Private constructor for logger to not other classes can access
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // creating log method with string parameter into it.
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}