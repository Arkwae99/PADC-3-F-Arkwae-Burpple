package com.padcmyanmar.burpple.events;

import com.padcmyanmar.burpple.data.vo.FeaturedVO;
import com.padcmyanmar.burpple.data.vo.GuideVO;

import java.util.List;

/**
 * Created by Ag Phone Khant on 14/1/2018.
 */

public class LoadGuideEvent {

    private List<GuideVO> guideList;

    public LoadGuideEvent(List<GuideVO> guideList) {
        this.guideList = guideList;
    }

    public List<GuideVO> getGuideList() {
        return guideList;
    }
}
