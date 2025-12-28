package Iterator;

/**
 * Iterator Pattern Example - Social Network
 * 
 * The Iterator pattern provides a way to access elements of a collection
 * sequentially without exposing its underlying representation.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern Demo - Social Network");
        System.out.println("=".repeat(50));

        Facebook facebook = new Facebook();

        System.out.println("\nAlice's friends:");
        ProfileIterator friendsIterator = facebook.createFriendsIterator("alice@example.com");
        while (friendsIterator.hasNext()) {
            Profile friend = friendsIterator.getNext();
            System.out.println("  - " + friend);
        }

        System.out.println("\nAlice's coworkers:");
        ProfileIterator coworkersIterator = facebook.createCoworkersIterator("alice@example.com");
        while (coworkersIterator.hasNext()) {
            Profile coworker = coworkersIterator.getNext();
            System.out.println("  - " + coworker);
        }

        System.out.println("\nBob's coworkers:");
        ProfileIterator bobCoworkers = facebook.createCoworkersIterator("bob@example.com");
        while (bobCoworkers.hasNext()) {
            Profile coworker = bobCoworkers.getNext();
            System.out.println("  - " + coworker);
        }
    }
}
