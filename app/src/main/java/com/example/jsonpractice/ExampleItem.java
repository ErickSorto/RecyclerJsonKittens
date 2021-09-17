package com.example.jsonpractice;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

public class ExampleItem {
    String mImageUrl;
    String mCreator;
    int mLikes;

    public ExampleItem(String imageUrl, String creator, int likes) {
        this.mImageUrl = imageUrl;
        this.mCreator = creator;
        this.mLikes = likes;
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
