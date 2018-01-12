package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.viewholders.TrendingViewHolder;

/**
 * Created by Ag Phone Khant on 13/1/2018.
 */

public class TrendingAdapter extends RecyclerView.Adapter {
    @Override
    public TrendingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View foodTrendingVenues = layoutInflater.inflate(R.layout.item_trending, parent, false);
        TrendingViewHolder trendingViewHolder= new TrendingViewHolder(foodTrendingVenues);
        return trendingViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
