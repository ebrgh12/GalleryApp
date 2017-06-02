package com.example.girish.galleryapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Girish on 6/1/2017.
 */

public class DetailPageBean {

    Drawable imageData;

    public DetailPageBean(Drawable imageData) {
        this.imageData = imageData;
    }

    public Drawable getImageData() {
        return imageData;
    }

    public void setImageData(Drawable imageData) {
        this.imageData = imageData;
    }

}
