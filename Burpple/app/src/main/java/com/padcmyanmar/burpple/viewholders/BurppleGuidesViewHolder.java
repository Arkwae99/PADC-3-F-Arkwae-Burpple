package com.padcmyanmar.burpple.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.GuideVO;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ag Phone Khant on 7/1/2018.
 */

public class BurppleGuidesViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_food_burpple)
    ImageView ivFoodBurpple;

    @BindView(R.id.tv_bbg_title)
    TextView tvBbgTitle;


    public BurppleGuidesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setGuide(GuideVO guide) {
        tvBbgTitle.setText(guide.getGuideTitle());

        Glide.with(ivFoodBurpple.getContext())
                .load(guide.getGuideImage())
                .into(ivFoodBurpple);
    }
}
