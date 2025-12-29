package Learning03;

public class EqualizerDecorator extends BaseDecorator {
    public EqualizerDecorator(Song decoratedSong) {
        super(decoratedSong);
    }

    @Override
    public void play() {
        super.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("[Equalizer effect added]");
    }
}
