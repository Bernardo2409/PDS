package Learning03;

public class BasicSong implements Song {

    private String name;
    
    public BasicSong(String name) {

        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + name);
    }
    
}
