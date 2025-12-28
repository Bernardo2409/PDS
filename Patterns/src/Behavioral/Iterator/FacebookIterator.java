package Iterator;

import java.util.List;

/**
 * Concrete iterator for Facebook.
 */
public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String profileEmail;
    private int currentPosition = 0;
    private List<String> emails;

    public FacebookIterator(Facebook facebook, String type, String profileEmail) {
        this.facebook = facebook;
        this.type = type;
        this.profileEmail = profileEmail;
        loadEmails();
    }

    private void loadEmails() {
        if (type.equals("friends")) {
            emails = facebook.getFriends(profileEmail);
        } else {
            emails = facebook.getCoworkers(profileEmail);
        }
    }

    @Override
    public boolean hasNext() {
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        String email = emails.get(currentPosition);
        currentPosition++;
        return facebook.getProfileByEmail(email);
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
