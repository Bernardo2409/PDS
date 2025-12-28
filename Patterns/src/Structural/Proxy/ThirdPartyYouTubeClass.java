package Proxy;

/**
 * RealSubject - the real service that does the actual work.
 * Simulates slow network operations to YouTube.
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public String listVideos() {
        // Simulating slow network request
        sleep();
        return "Video list: [video1, video2, video3, video4, video5]";
    }

    @Override
    public String getVideoInfo(String id) {
        // Simulating slow network request
        sleep();
        return "Video info for '" + id + "': Title, Description, Duration, etc.";
    }

    @Override
    public void downloadVideo(String id) {
        // Simulating slow download
        sleep();
        System.out.println("Downloading video '" + id + "'...");
    }

    private void sleep() {
        try {
            System.out.println("    [Connecting to YouTube server...]");
            Thread.sleep(100); // Simulate network delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
