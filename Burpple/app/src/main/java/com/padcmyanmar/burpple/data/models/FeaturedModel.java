package com.padcmyanmar.burpple.data.models;


import com.padcmyanmar.burpple.network.FeaturedDataAgent;
import com.padcmyanmar.burpple.network.FeaturedRetrofitDataAgent;

/**
 * Created by Lenovo on 1/12/2018.
 */

public class FeaturedModel {

    private FeaturedDataAgent mFeaturedDataAgent;

    private static FeaturedModel sObjInstance;

    private FeaturedModel(){
            //mFeaturedDataAgent= FeaturedOKHttpDataAgent.getsObjInstance();
        mFeaturedDataAgent= FeaturedRetrofitDataAgent.getsObjInstance();
    }

    public static FeaturedModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new FeaturedModel();
        }
        return sObjInstance;
    }

    public void loadFeatured(){
        mFeaturedDataAgent.loadFeatured();
    }
}
