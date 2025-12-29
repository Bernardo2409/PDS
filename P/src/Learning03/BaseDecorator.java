package Learning03;

public abstract class BaseDecorator implements Song {
    
    protected Song decoratedSong;

    public BaseDecorator(Song decoratedSong) {
        this.decoratedSong = decoratedSong;
    }

    @Override
    public void play() {
        decoratedSong.play();
    }
}
