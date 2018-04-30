package com.padcmyanmar.burpple.events;


import com.padcmyanmar.burpple.data.vo.PromotionVO;

import java.util.List;

/**
 * Created by Lenovo on 1/12/2018.
 */

public class LoadPromotionEvent {

    private List<PromotionVO> promotionList;

    public LoadPromotionEvent(List<PromotionVO> promotionList) {
        this.promotionList = promotionList;
    }

    public List<PromotionVO> getPromotionList() {
        return promotionList;
    }
}
