package com.padcmyanmar.burpple.data.models;


import com.padcmyanmar.burpple.network.GuideDataAgent;
import com.padcmyanmar.burpple.network.GuideRetrofitDataAgent;

/**
 * Created by Lenovo on 1/12/2018.
 */

public class GuideModel {

    private GuideDataAgent sGuideDataAgent;

    private static GuideModel sObjInstance;

    private GuideModel(){

        //sPromotionDataAgent= GuideOKHttpDataAgent.getsObjInstance();
        sGuideDataAgent= GuideRetrofitDataAgent.getsObjInstance();
    }

    public static GuideModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new GuideModel();
        }
        return sObjInstance;
    }

    public void LoadGuide(){
        sGuideDataAgent.loadGuide();
    }
}
