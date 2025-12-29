package Learning03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Creating playlists");
        Playlist playlist1 = PlaylistFactory.createPlaylist("rock", "My Rock Collection");
        Playlist playlist2 = PlaylistFactory.createPlaylist("pop", "Top Pop Hits");
        Playlist playlist3 = PlaylistFactory.createPlaylist("jazz", "Smooth Jazz");

        playlist1.create();
        playlist2.create();
        playlist3.create();

        System.out.println("\nPart B: Decorating songs");
        Song song1 = new BasicSong("Song1");
        song1.play();

        Song song2 = new EqualizerDecorator(new BasicSong("Song1"));
        song2.play();

        Song song3 = new LyricsDecorator(new EqualizerDecorator(new BasicSong("Song1")));
        song3.play();

        System.out.println("\nPart C: Processing song requests");
        RequestHandler genreHandler = new GenreHandler();
        RequestHandler artistHandler = new ArtistHandler();
        RequestHandler defaultHandler = new DefaultHandler();

        genreHandler.setNext(artistHandler).setNext(defaultHandler);

        genreHandler.handle("rock");
        genreHandler.handle("Beatles");
        genreHandler.handle("podcast");

        System.out.println("\nPart D: Player commands");
        Player player = new Player();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new PlayCommand(player));
        remote.pressButton();

        remote.setCommand(new PauseCommand(player));
        remote.pressButton();

        remote.setCommand(new SkipCommand(player));
        remote.pressButton();

        System.out.println("\nPart E: Notifications");
        StreamingCenter center = StreamingCenter.getInstance();
        center.register(new DisplayModule());
        center.register(new AnalyticsModule());

        center.notifyListeners("Track started: Song1");

        System.out.println("\nPart F: Registry content");
        StreamingRegistry.getInstance().addPlaylist(playlist1);
        StreamingRegistry.getInstance().addPlaylist(playlist2);
        StreamingRegistry.getInstance().addPlaylist(playlist3);
        StreamingRegistry.getInstance().writeToFile();
        StreamingRegistry.getInstance().printFileContent();

    }
}
