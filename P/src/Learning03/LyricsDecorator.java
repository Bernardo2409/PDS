package Learning03;

public class LyricsDecorator extends BaseDecorator {
	public LyricsDecorator(Song decoratedSong) {
		super(decoratedSong);
	}

	@Override
	public void play() {
		super.play();
		showLyrics();
	}

	private void showLyrics() {
		System.out.println("[Lyrics displayed]");
	}
}
