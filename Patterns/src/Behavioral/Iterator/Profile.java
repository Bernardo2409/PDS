package Iterator;

/**
 * Profile represents elements in the collection.
 */
public class Profile {
    private String name;
    private String email;

    public Profile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Profile{name='" + name + "', email='" + email + "'}";
    }
}
