package com.example.girish.galleryapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Girish on 6/1/2017.
 */

public class DetailPageViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public DetailPageViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image_view);
    }

}
