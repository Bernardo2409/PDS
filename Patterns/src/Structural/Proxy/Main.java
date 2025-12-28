package Proxy;

/**
 * Proxy Pattern Example - YouTube Caching
 * 
 * The Proxy pattern provides a substitute or placeholder for another object.
 * In this example, YouTubeCacheProxy caches results from ThirdPartyYouTubeClass
 * to avoid repeated slow network operations.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Pattern Demo - YouTube Caching");
        System.out.println("=".repeat(50));

        YouTubeCacheProxy youtubeProxy = new YouTubeCacheProxy();

        // First request - will be slow (cache miss)
        System.out.println("\n1. First request for video list:");
        System.out.println(youtubeProxy.listVideos());

        // Second request - fast (cache hit)
        System.out.println("\n2. Second request for video list:");
        System.out.println(youtubeProxy.listVideos());

        // Request video info - cache miss
        System.out.println("\n3. First request for video1 info:");
        System.out.println(youtubeProxy.getVideoInfo("video1"));

        // Request same video info - cache hit
        System.out.println("\n4. Second request for video1 info:");
        System.out.println(youtubeProxy.getVideoInfo("video1"));

        // Request different video - cache miss
        System.out.println("\n5. Request for video2 info:");
        System.out.println(youtubeProxy.getVideoInfo("video2"));

        // Download always goes through
        System.out.println("\n6. Download request:");
        youtubeProxy.downloadVideo("video1");
    }
}
