public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Toca MP3 diretamente
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        // Usa o Adapter para tocar formatos antigos
        else if (audioType.equalsIgnoreCase("oldFormat")) {
            mediaAdapter = new MediaAdapter(new OldMediaPlayer());
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
