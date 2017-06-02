package com.example.girish.galleryapp;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Girish on 6/1/2017.
 */

public class DetailPageAdapter extends RecyclerView.Adapter<DetailPageViewHolder> {

    Activity activity;
    List<DetailPageBean> detailPageBeen;
    DetailPageViewHolder detailPageViewHolder;

    public DetailPageAdapter(Activity activity,
                             List<DetailPageBean> detailPageBeen) {
        this.activity = activity;
        this.detailPageBeen = detailPageBeen;
    }

    @Override
    public DetailPageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_list_item, parent, false);
        detailPageViewHolder = new DetailPageViewHolder(view);
        return detailPageViewHolder;
    }

    @Override
    public void onBindViewHolder(DetailPageViewHolder holder, int position) {
        holder.imageView.setImageDrawable(detailPageBeen.get(position).getImageData());
    }

    @Override
    public int getItemCount() {
        return detailPageBeen.size();
    }

}
