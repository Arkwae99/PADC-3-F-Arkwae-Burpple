package com.padcmyanmar.burpple.network.response;

import com.padcmyanmar.burpple.data.vo.GuideVO;
import com.padcmyanmar.burpple.data.vo.PromotionVO;

import java.util.List;

/**
 * Created by Ag Phone Khant on 14/1/2018.
 */

public class GetGuideResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<GuideVO> featured;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<GuideVO> getFeatured() {
        return featured;
    }
}
