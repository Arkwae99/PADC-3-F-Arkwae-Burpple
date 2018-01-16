package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.FeaturedVO;
import com.padcmyanmar.burpple.viewitems.BackgroundInforImagesViewItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ag Phone Khant on 7/1/2018.
 */

public class BackgroundInforImagesAdapter extends PagerAdapter {
    @BindView(R.id.iv_food_images)
    ImageView ivFoodImage;

    @BindView(R.id.tv_feature)
    TextView tvFeatures;

    @BindView(R.id.tv_text_food_details_images)
    TextView tvTextFoodImg;

    @BindView(R.id.tv_text_food_details_images_small)
    TextView getTvTextFoodImgSmall;

    private List<FeaturedVO> mFeaturedList;

    public BackgroundInforImagesAdapter(){
        mFeaturedList=new ArrayList<>();
    }
    @Override
    public int getCount() {
        return mFeaturedList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        BackgroundInforImagesViewItem view = (BackgroundInforImagesViewItem) inflater.inflate(R.layout.item_background_infor_image, container, false);
        ButterKnife.bind(this,view);

        tvFeatures.setText(mFeaturedList.get(position).getFeatureTag());
        tvTextFoodImg.setText(mFeaturedList.get(position).getFeatureTitle());
        getTvTextFoodImgSmall.setText(mFeaturedList.get(position).getFeatureDescription());

        Glide.with(ivFoodImage.getContext())
                .load(mFeaturedList.get(position).getFeatureImage())
                .into(ivFoodImage);
        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
    public void setFeatured(List<FeaturedVO> featuredList) {
        mFeaturedList = featuredList;
        notifyDataSetChanged();
    }
}