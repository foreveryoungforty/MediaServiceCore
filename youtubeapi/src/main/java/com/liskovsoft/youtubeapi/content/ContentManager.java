package com.liskovsoft.youtubeapi.content;

import com.liskovsoft.youtubeapi.content.models.ContentTab;
import com.liskovsoft.youtubeapi.content.models.ContentTabCollection;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

public interface ContentManager {
    @Headers("Content-Type: application/json")
    @POST("https://www.youtube.com/youtubei/v1/browse?key=AIzaSyDCU8hByM-4DrUqRUYnGn-3llEO78bcxq8")
    Call<ContentTabCollection> getContentTabs(@Body String jsonData);
}