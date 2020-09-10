package com.liskovsoft.youtubeapi.browse.ver2.models.grid;

import com.liskovsoft.youtubeapi.common.converters.jsonpath.JsonPath;
import com.liskovsoft.youtubeapi.common.models.items.RadioItem;
import com.liskovsoft.youtubeapi.common.models.items.VideoItem;

import java.util.List;

public class GridTabContinuation {
    @JsonPath("$.continuationContents.gridContinuation.items[*].gridVideoRenderer")
    private List<VideoItem> mVideoItems;

    @JsonPath("$.continuationContents.gridContinuation.items[*].gridRadioRenderer")
    private List<RadioItem> mPlaylistItems;

    @JsonPath("$.continuationContents.gridContinuation.continuations[0].nextContinuationData.continuation")
    private String mNextPageKey;

    public List<VideoItem> getVideoItems() {
        return mVideoItems;
    }

    public List<RadioItem> getPlaylistItems() {
        return mPlaylistItems;
    }

    public String getNextPageKey() {
        return mNextPageKey;
    }
}
