package com.example.ratehaus;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostReviewScreen extends AppCompatActivity {

    @BindView(R.id.btnSubmitReview)
    Button btnSubmitReview;
    @BindView(R.id.etFeedback)
    EditText editTextfeedback;
    @BindView(R.id.txtviewRatingScale)
    TextView txtviewRatingScale;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.RatingLayout)
    LinearLayout ratingLayout;
    @BindView(R.id.btnBackReview)
    Button btnBackToReviews;
    @BindView(R.id.datesFilterSpinner)
    AutoCompleteTextView autoCompleteTextView;

    String feedback;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_review_screen);

        ButterKnife.bind(this);

        //Creating Spinner values
        String[] options = {"Haus A","Haus B","Haus C","Haus D","Haus E","Haus H","Haus I","Haus P","Haus Q"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.option_item,options);

        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString(),false);
        autoCompleteTextView.setAdapter(arrayAdapter);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtviewRatingScale.setText(String.valueOf(rating));
                switch ((int) ratingBar.getRating()){
                    case 1:
                        txtviewRatingScale.setText("Very Bad");
                        break;
                    case 2:
                        txtviewRatingScale.setText("Bad");
                        break;
                    case 3:
                        txtviewRatingScale.setText("Average");
                        break;
                    case 4:
                        txtviewRatingScale.setText("Good");
                        break;
                    case 5:
                        txtviewRatingScale.setText("Excellent");
                        break;
                    default:
                        txtviewRatingScale.setText("");
                }
            }
        });

        btnSubmitReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feedback = editTextfeedback.getText().toString();
                String hause_name = autoCompleteTextView.getText().toString();
                String rating = String.valueOf(ratingBar.getRating());
                if (feedback.isEmpty()){
                    Toast.makeText(PostReviewScreen.this, "Please provide feedback", Toast.LENGTH_SHORT).show();
                }
                else if (!feedback.toString().equals("")){
                    Toast.makeText(PostReviewScreen.this, "Feedback sent Successfully", Toast.LENGTH_SHORT).show();
                    ratingLayout.setVisibility(View.GONE);
                    btnBackToReviews.setVisibility(View.VISIBLE);

                }
            }
        });

    }
}