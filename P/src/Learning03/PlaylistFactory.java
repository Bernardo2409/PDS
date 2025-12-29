package Learning03;

public class PlaylistFactory {
    
    public static Playlist createPlaylist(String type, String genre) {

        switch (type) {
            case "rock":
                return new RockPlaylist(type, genre);
            case "pop":
                return new PopPlaylist(type, genre);
            case "jazz" :
                return new JazzPlaylist(type, genre);
            default:
                System.out.println("Não existe playlist deste tipo");
                return null;
        }

    }
}
