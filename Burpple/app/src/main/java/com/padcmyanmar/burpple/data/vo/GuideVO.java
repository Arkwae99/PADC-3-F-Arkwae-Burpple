package com.padcmyanmar.burpple.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ag Phone Khant on 14/1/2018.
 */

public class GuideVO {

    @SerializedName("burpple-guide-id")
    private String guideId;
    @SerializedName("burpple-guide-image")
    private String guideImage;
    @SerializedName("burpple-guide-title")
    private String guideTitle;
    @SerializedName("burpple-guide-desc")
    private String guideDescription;

    public String getGuideId() {
        return guideId;
    }

    public String getGuideImage() {
        return guideImage;
    }

    public String getGuideTitle() {
        return guideTitle;
    }

    public String getGuideDescription() {
        return guideDescription;
    }
}
