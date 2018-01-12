package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.viewholders.BurppleGuidesViewHolder;

/**
 * Created by Ag Phone Khant on 7/1/2018.
 */

public class BurppleGuidesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View guideItemView=inflater.inflate(R.layout.item_burpple_guides,parent,false);
        BurppleGuidesViewHolder guideItemViewHolder=new BurppleGuidesViewHolder(guideItemView);
        return guideItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
