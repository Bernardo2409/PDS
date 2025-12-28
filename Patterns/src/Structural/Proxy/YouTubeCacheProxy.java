package Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Proxy - caches results from the real service.
 * This is a caching proxy that avoids repeated slow operations.
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private String cacheVideoList;
    private Map<String, String> cacheVideoInfo = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public String listVideos() {
        if (cacheVideoList == null) {
            System.out.println("Proxy: Cache MISS for video list");
            cacheVideoList = youtubeService.listVideos();
        } else {
            System.out.println("Proxy: Cache HIT for video list");
        }
        return cacheVideoList;
    }

    @Override
    public String getVideoInfo(String id) {
        if (!cacheVideoInfo.containsKey(id)) {
            System.out.println("Proxy: Cache MISS for video '" + id + "'");
            cacheVideoInfo.put(id, youtubeService.getVideoInfo(id));
        } else {
            System.out.println("Proxy: Cache HIT for video '" + id + "'");
        }
        return cacheVideoInfo.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        // Downloads are always forwarded to real service
        youtubeService.downloadVideo(id);
    }

    public void resetCache() {
        cacheVideoList = null;
        cacheVideoInfo.clear();
        System.out.println("Proxy: Cache cleared");
    }
}
