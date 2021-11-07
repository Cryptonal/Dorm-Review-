package com.example.ratehaus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] reviews){
        super(context, R.layout.custom_layout, reviews);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customeView = inflater.inflate(R.layout.custom_layout, parent,false);

        String reviewposition = getItem(position);
        Integer[] ratingbarf = { 4,3,4,5,2,1,3 };


        ImageView imgview = (ImageView) customeView.findViewById(R.id.imageView);
        RatingBar ratingbar = (RatingBar) customeView.findViewById(R.id.ratingBar);
        TextView review = (TextView) customeView.findViewById(R.id.txtview_review);

        ratingbar.setRating(4);
       imgview.setImageResource(R.drawable.user_icon);
       review.setText(reviewposition);

        return customeView;

    }
}
