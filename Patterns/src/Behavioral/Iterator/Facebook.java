package Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Concrete collection - Facebook implementation.
 */
public class Facebook implements SocialNetwork {
    private List<Profile> profiles = new ArrayList<>();
    private Map<String, List<String>> friends = new HashMap<>();
    private Map<String, List<String>> coworkers = new HashMap<>();

    public Facebook() {
        // Sample data
        profiles.add(new Profile("Alice", "alice@example.com"));
        profiles.add(new Profile("Bob", "bob@example.com"));
        profiles.add(new Profile("Charlie", "charlie@example.com"));
        profiles.add(new Profile("Diana", "diana@example.com"));

        friends.put("alice@example.com", List.of("bob@example.com", "charlie@example.com"));
        friends.put("bob@example.com", List.of("alice@example.com"));

        coworkers.put("alice@example.com", List.of("diana@example.com"));
        coworkers.put("bob@example.com", List.of("charlie@example.com", "diana@example.com"));
    }

    public Profile getProfileByEmail(String email) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(email)) {
                return profile;
            }
        }
        return null;
    }

    public List<String> getFriends(String email) {
        return friends.getOrDefault(email, new ArrayList<>());
    }

    public List<String> getCoworkers(String email) {
        return coworkers.getOrDefault(email, new ArrayList<>());
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
