package com.example.girish.galleryapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Girish on 6/1/2017.
 */

public class HomeListAdapter extends RecyclerView.Adapter<HomeListViewHolder> {

    Activity activity;
    MainActivity mainActivity;
    List<HomePageListBean> homePageListBeen;
    HomeListViewHolder homeListViewHolder;

    public HomeListAdapter(Activity activity,
                           MainActivity mainActivity,
                           List<HomePageListBean> homePageListBeen) {
        this.activity = activity;
        this.mainActivity = mainActivity;
        this.homePageListBeen = homePageListBeen;
    }

    @Override
    public HomeListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_list_item, parent, false);
        homeListViewHolder = new HomeListViewHolder(view);
        return homeListViewHolder;
    }

    @Override
    public void onBindViewHolder(HomeListViewHolder holder, final int position) {
        holder.labelName.setText(homePageListBeen.get(position).getImageName());
        holder.imageView.setImageDrawable(homePageListBeen.get(position).getImageDrawable());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity,DetailScreenActivity.class);
                intent.putExtra("label_name",homePageListBeen.get(position).getImageName());
                activity.startActivity(intent);
            }
        });

        holder.imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ImageDialogFragment imageDialogFragment = new ImageDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("label_name",homePageListBeen.get(position).getImageName());
                imageDialogFragment.setArguments(bundle);
                imageDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE,
                        android.R.style.Theme_DeviceDefault_Light_Dialog);
                imageDialogFragment.setCancelable(true);
                imageDialogFragment.show(activity.getFragmentManager(), "");
               // Toast.makeText(activity, "Long CLick event ready", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return homePageListBeen.size();
    }

}
