package Adapter;


public class MediaAdapter implements MediaPlayer {
    private OldMediaPlayer oldMediaPlayer;

    public MediaAdapter(OldMediaPlayer oldMediaPlayer) {
        this.oldMediaPlayer = oldMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        // Adaptando para o formato antigo
        if (audioType.equalsIgnoreCase("oldFormat")) {
            oldMediaPlayer.playOldFormat(fileName);
        }
    }
}