package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.GuideVO;
import com.padcmyanmar.burpple.viewholders.BurppleGuidesViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ag Phone Khant on 7/1/2018.
 */

public class BurppleGuidesAdapter extends RecyclerView.Adapter<BurppleGuidesViewHolder> {
    private List<GuideVO> mGuideList;

    public BurppleGuidesAdapter() {
        mGuideList = new ArrayList<>();
    }

    @Override
    public BurppleGuidesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View guideItemView = inflater.inflate(R.layout.item_burpple_guides, parent, false);
        BurppleGuidesViewHolder guideItemViewHolder = new BurppleGuidesViewHolder(guideItemView);
        return guideItemViewHolder;
    }

    @Override
    public void onBindViewHolder(BurppleGuidesViewHolder holder, int position) {
        holder.setGuide(mGuideList.get(position));
    }


    @Override
    public int getItemCount() {
        return mGuideList.size();
    }

    public void setGuide(List<GuideVO> guideList) {
        mGuideList = guideList;
        notifyDataSetChanged();
    }
}
