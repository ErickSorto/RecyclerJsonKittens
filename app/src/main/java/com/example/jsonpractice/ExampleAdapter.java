package com.example.jsonpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    Context mContext;
    ArrayList<ExampleItem> mExampleItemArrayList;

    public ExampleAdapter(Context context, ArrayList<ExampleItem> exampleItemArrayList) {
        this.mContext = context;
        this.mExampleItemArrayList = exampleItemArrayList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleItemArrayList.get(position);

        String imageUrl = currentItem.getImageUrl();
        String creatorName = currentItem.getCreator();
        int likeCount = currentItem.getLikes();

        holder.mCreator.setText(creatorName);
        holder.mLikes.setText("Likes " + likeCount);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mExampleItemArrayList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mLikes;
        TextView mCreator;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_view);
            mCreator = itemView.findViewById(R.id.text_view_creator);
            mLikes = itemView.findViewById(R.id.text_view_likes);
        }
    }
}