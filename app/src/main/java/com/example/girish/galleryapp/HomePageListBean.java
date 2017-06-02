package com.example.girish.galleryapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Girish on 6/1/2017.
 */

public class HomePageListBean {

    String imageName;
    Drawable imageDrawable;

    public HomePageListBean(String imageName, Drawable imageDrawable) {
        this.imageName = imageName;
        this.imageDrawable = imageDrawable;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(Drawable imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

}
