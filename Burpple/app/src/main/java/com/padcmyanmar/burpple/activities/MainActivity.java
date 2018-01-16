package com.padcmyanmar.burpple.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.padcmyanmar.burpple.BurppleApp;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.adapters.BackgroundInforImagesAdapter;
import com.padcmyanmar.burpple.adapters.BurppleGuidesAdapter;
import com.padcmyanmar.burpple.adapters.NewAdapter;
import com.padcmyanmar.burpple.adapters.PromotionsAdapter;
import com.padcmyanmar.burpple.adapters.TrendingAdapter;
import com.padcmyanmar.burpple.data.models.FeaturedModel;
import com.padcmyanmar.burpple.data.models.GuideModel;
import com.padcmyanmar.burpple.data.models.PromotionModel;
import com.padcmyanmar.burpple.events.LoadFeaturedEvent;
import com.padcmyanmar.burpple.events.LoadGuideEvent;
import com.padcmyanmar.burpple.events.LoadPromotionEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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

        FeaturedModel.getsObjInstance().loadFeatured();
        PromotionModel.getsObjInstance().LoadPromotion();
        GuideModel.getsObjInstance().LoadGuide();
    }


    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFeaturedLoaded(LoadFeaturedEvent event){
        Log.d(BurppleApp.LOG_TAG,"FeaturedLoaded"+event.getFeaturedList().size());
        mBackgroundInforImagesAdapter.setFeatured(event.getFeaturedList());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPromotionLoaded(LoadPromotionEvent event){
        Log.d(BurppleApp.LOG_TAG,"mmPromotionLoaded"+event.getPromotionList().size());
        mPromotionsAdapter.setPromotion(event.getPromotionList());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGuideLoaded(LoadGuideEvent event){
        Log.d(BurppleApp.LOG_TAG,"mmGuideLoaded"+event.getGuideList().size());
        mBurppleGuidesAdapter.setGuide(event.getGuideList());
    }
}
