package com.padcmyanmar.burpple.viewholders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.PromotionVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ag Phone Khant on 7/1/2018.
 */

public class PromotionsViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.iv_food_promotions)
    ImageView ivFoodPromotion;

    @BindView(R.id.tv_1for1)
    TextView tvOneForOne;

    @BindView(R.id.tv_date)
    TextView tvPromotionEndDate;

    @BindView(R.id.tv_food_name)
    TextView tvPromotionShopName;

    @BindView(R.id.tv_seller)
    TextView tvPromotionShopArea;



    public PromotionsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setPromotion(PromotionVO promotion){
        tvOneForOne.setText(promotion.getPromotionTitle());
        tvPromotionEndDate.setText(promotion.getPromotionUntil());
        tvPromotionShopName.setText(promotion.getPromotionShop().getPromotionShopName());
        tvPromotionShopArea.setText(promotion.getPromotionShop().getPromotionShopArea());

        Glide.with(ivFoodPromotion.getContext())
                .load(promotion.getPromotionImage())
                .into(ivFoodPromotion);

    }

}