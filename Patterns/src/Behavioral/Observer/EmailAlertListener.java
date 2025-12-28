package Observer;

public class EmailAlertListener implements EventListener {
    private String email;

    public EmailAlertListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " on file " + file);
    }
}
