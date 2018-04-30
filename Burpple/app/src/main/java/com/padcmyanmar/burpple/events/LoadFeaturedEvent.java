package com.padcmyanmar.burpple.events;


import com.padcmyanmar.burpple.data.vo.FeaturedVO;

import java.util.List;

/**
 * Created by Lenovo on 1/12/2018.
 */

public class LoadFeaturedEvent {

    private List<FeaturedVO> featuredList;

    public LoadFeaturedEvent(List<FeaturedVO> featuredList) {
        this.featuredList = featuredList;
    }

    public List<FeaturedVO> getFeaturedList() {
        return featuredList;
    }
}
