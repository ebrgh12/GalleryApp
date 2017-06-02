package com.example.girish.galleryapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Girish on 6/1/2017.
 */

public class HomeListViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView labelName;

    public HomeListViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image_view);
        labelName = (TextView) itemView.findViewById(R.id.label_name);
    }

}
