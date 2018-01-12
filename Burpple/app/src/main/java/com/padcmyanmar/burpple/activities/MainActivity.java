package com.padcmyanmar.burpple.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.adapters.BackgroundInforImagesAdapter;
import com.padcmyanmar.burpple.adapters.BurppleGuidesAdapter;
import com.padcmyanmar.burpple.adapters.NewAdapter;
import com.padcmyanmar.burpple.adapters.PromotionsAdapter;
import com.padcmyanmar.burpple.adapters.TrendingAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tb_toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_newly_open_view_pager)
    ViewPager vpNewlyOpen;

    @BindView(R.id.rv_promotions)
    RecyclerView rvPromotions;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView rvFoodBurppleGuides;

    @BindView(R.id.rv_newly_opened)
    RecyclerView rvFoodNewlyOpened;

    @BindView(R.id.rv_trending_venues)
    RecyclerView rvFoodTrendingVenues;

    private BackgroundInforImagesAdapter mBackgroundInforImagesAdapter;
    private PromotionsAdapter mPromotionsAdapter;
    private BurppleGuidesAdapter mBurppleGuidesAdapter;
    private NewAdapter mNewsAdapter;
    private TrendingAdapter mTrendingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        mBackgroundInforImagesAdapter = new BackgroundInforImagesAdapter();
        vpNewlyOpen.setAdapter(mBackgroundInforImagesAdapter);

        mPromotionsAdapter = new PromotionsAdapter();
        LinearLayoutManager lmFoodPromotion = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPromotions.setLayoutManager(lmFoodPromotion);
        rvPromotions.setAdapter(mPromotionsAdapter);

        mBurppleGuidesAdapter = new BurppleGuidesAdapter();
        LinearLayoutManager lmFoodBurppleGuides = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvFoodBurppleGuides.setLayoutManager(lmFoodBurppleGuides);
        rvFoodBurppleGuides.setAdapter(mBurppleGuidesAdapter);

        mNewsAdapter = new NewAdapter();
        LinearLayoutManager lmFoodNewlyOpened = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvFoodNewlyOpened.setLayoutManager(lmFoodNewlyOpened);
        rvFoodNewlyOpened.setAdapter(mNewsAdapter);

        mTrendingAdapter = new TrendingAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvFoodTrendingVenues.setLayoutManager(linearLayoutManager);
        rvFoodTrendingVenues.setAdapter(mTrendingAdapter);
    }
}