package com.example.jsonpractice;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

public class ExampleItem {
    String mImageUrl;
    String mCreator;
    int mLikes;

    public ExampleItem(String mImageUrl, String mCreator, int mLikes) {
        this.mImageUrl = mImageUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikes() {
        return mLikes;
    }
}
