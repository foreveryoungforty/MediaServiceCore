package com.liskovsoft.youtubeapi.lounge.models.commands;

import com.liskovsoft.youtubeapi.common.converters.jsonpath.JsonPath;

import java.util.List;

public class CommandInfo {
    public static final String TYPE_PLAYLIST = "setPlaylist";
    public static final String TYPE_NOW_PLAYING = "getNowPlaying";
    public static final String TYPE_NOP = "noop";
    public static final String TYPE_SESSION_ID = "c";
    public static final String TYPE_G_SESSION_ID = "S";

    @JsonPath("$[0]")
    private int mIndex;

    @JsonPath("$[1][0]")
    private String mType;

    @JsonPath("$[1][1]")
    private PlaylistData mPlaylistData;

    @JsonPath("$[1][1:]")
    private List<String> mParams;

    public int getIndex() {
        return mIndex;
    }

    public String getType() {
        return mType;
    }

    public List<String> getParams() {
        return mParams;
    }

    public PlaylistData getPlaylistData() {
        return mPlaylistData;
    }
}