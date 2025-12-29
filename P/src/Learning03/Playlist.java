package Learning03;

public class Playlist {

    private String name;
    private String genre;

    
    public Playlist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void create() {

        System.out.println(name + " playlist created");
    }

}
    
