package com.padcmyanmar.burpple.network;

import com.padcmyanmar.burpple.network.response.GetGuideResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Ag Phone Khant on 14/1/2018.
 */

public interface GuideApi {
    @FormUrlEncoded
    @POST("getGuides.php")
    Call<GetGuideResponse> getGuide(@Field("page") int page,
                                    @Field("access_token") String accessToken);
}
