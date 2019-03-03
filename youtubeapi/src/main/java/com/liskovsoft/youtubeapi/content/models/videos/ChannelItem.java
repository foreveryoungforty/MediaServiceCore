package com.liskovsoft.youtubeapi.content.models.videos;

import com.liskovsoft.youtubeapi.converters.jsonpath.JsonPath;
import com.liskovsoft.youtubeapi.converters.jsonpath.JsonPathCollection;

public class ChannelItem {
    @JsonPath("$.thumbnail.thumbnails[*]")
    private JsonPathCollection<Thumbnail> thumbnails = new JsonPathCollection<>(Thumbnail.class);
    @JsonPath("$.title.runs[0].text")
    private String title;
    @JsonPath("$.channelId")
    private String channelId;
    @JsonPath("$.navigationEndpoint.browseEndpoint.browseId")
    private String browseId;
    @JsonPath("$.videoCountText.runs[0].text")
    private String videoCount;
    @JsonPath("$.subscriberCountText.runs[0].text")
    private String subscriberCount;

    public JsonPathCollection<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public String getTitle() {
        return title;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getBrowseId() {
        return browseId;
    }

    public String getVideoCount() {
        return videoCount;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }
}