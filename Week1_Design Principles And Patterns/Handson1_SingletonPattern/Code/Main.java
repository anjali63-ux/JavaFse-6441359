// Main method to run the program
public class Main {
    public static void main(String[] args) {
        // Attempt to get two Logger instances
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        // Use the log method by passing a message 
        log1.log("1st log message.");// O/P: [LOG] First log message
        log2.log("2nd log message.");// O/P: [LOG] Second log message.

        // Verify both reference variables point to the same instance
        if (log1 == log2) {
            System.out.println("Singleton works - both variables point to the same logger.");
        } else {
            System.out.println("Singleton failed - Logger instances are different.");
        }
    }
}
