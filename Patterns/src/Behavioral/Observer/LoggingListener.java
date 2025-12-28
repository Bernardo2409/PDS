package Observer;

public class LoggingListener implements EventListener {
    private String logFile;

    public LoggingListener(String logFile) {
        this.logFile = logFile;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Log to " + logFile + ": Event '" + eventType + "' on file " + file);
    }
}
