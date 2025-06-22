package Week_1.Engineering_concepts.Design_Patterns_and_Principles.SingletonPatternExample;
public class Logger {
    private static Logger singleinstance;
    private Logger() {
        System.out.println("Logger is created...");
    }
    public static Logger getInstance() {
        if (singleinstance == null) {
            singleinstance = new Logger();
        }
        return singleinstance;
    }
    public void logMessage(String msg) {
        System.out.println("Log: " + msg);
    }
}
