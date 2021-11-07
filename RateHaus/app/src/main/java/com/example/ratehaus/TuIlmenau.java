package com.example.ratehaus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TuIlmenau extends AppCompatActivity {

    @BindView(R.id.btn_postReview)
    Button btn_postReview;
    @BindView(R.id.listview_reviews)
    ListView reviews_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_ilmenai);

        ButterKnife.bind(this);

        String[] reviews = {
                "This is a great haus to live in...",
                "Nice location on campus. Quiet place, perfect for study mode....",
                "Good haus and Highly recommend to choose....",
                "Best place to live on campus. Two people per bathroom instead of four!...",
                "Worst Haus I have lived at while studying at TU Ilmenau. I was in a Double with a random and it was truly awful. The room is way to small, the bathroom quickly becomes disgusting hours within its weekly cleaning.",
                "Don't sleep if you're a first year student because its better than West and Warren imo...",
                "Kind of Haus you're forced to take. Great location but cramped where you're forced to make friends, except there's not a lot of people around to make friends with....",
                };

        Integer[] ratingbar = { 4,3,4,5,2,1,3 };

        //Data coming from TuIlmenau
        String Haus_Name = getIntent().getStringExtra("HausName");

        ListAdapter reviewListAdapter = new CustomAdapter(this,reviews);
        reviews_listview.setAdapter(reviewListAdapter);

        Toast.makeText(this, "Welcome to :" + " " + Haus_Name, Toast.LENGTH_LONG).show();

        btn_postReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuIlmenau.this, PostReviewScreen.class);
                startActivity(intent);
            }
        });

    }
}