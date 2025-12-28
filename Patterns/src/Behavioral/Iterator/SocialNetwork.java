package Iterator;

/**
 * Collection interface declares factory method for creating iterators.
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
