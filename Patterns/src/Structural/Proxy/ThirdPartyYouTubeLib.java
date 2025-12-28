package Proxy;

/**
 * Subject interface declares common operations for RealSubject and Proxy.
 */
public interface ThirdPartyYouTubeLib {
    String listVideos();

    String getVideoInfo(String id);

    void downloadVideo(String id);
}
