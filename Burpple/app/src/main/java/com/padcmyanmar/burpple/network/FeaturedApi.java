package com.padcmyanmar.burpple.network;


import com.padcmyanmar.burpple.network.response.GetFeaturedResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Lenovo on 1/12/2018.
 */

public interface FeaturedApi {

    @FormUrlEncoded
    @POST("getFeatured.php")
    Call<GetFeaturedResponse> getFeatured(@Field("page") int page,
                                          @Field("access_token") String accessToken);
}
