package Facade;

import java.io.File;

/**
 * Facade Pattern Example - Video Conversion
 * 
 * The Facade pattern provides a simplified interface to a complex subsystem.
 * In this example, VideoConversionFacade hides the complexity of working with
 * codecs, bitrate readers, and audio mixers.
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();

        System.out.println("=== Converting video.ogg to mp4 ===");
        File mp4 = converter.convertVideo("video.ogg", "mp4");

        System.out.println();

        System.out.println("=== Converting another_video.mp4 to ogg ===");
        File ogg = converter.convertVideo("another_video.mp4", "ogg");
    }
}
