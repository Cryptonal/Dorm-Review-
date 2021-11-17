package com.example.ratehaus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.google.android.material.appbar.AppBarLayout;

public class AppIntroduction extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_app_introduction);

        addSlide(AppIntroFragment.newInstance("Find insights", "Finds insights to your next dream Haus",R.mipmap.appintrotest, Color.BLUE));
        addSlide(AppIntroFragment.newInstance("Give Feedbacks", "Help new students to find their dream haus by giving your valuable feedback", R.mipmap.introinsights, Color.GREEN));
        addSlide(AppIntroFragment.newInstance("Quick Tips","Get useful tips from Seniors and students living here already", R.mipmap.introtips, Color.GRAY));

        showSkipButton(true);
        getSupportActionBar().hide();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Toast.makeText(this, "You have to finish the tutorial first", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(AppIntroduction.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed() {
        super.onDonePressed();
        Toast.makeText(this, "You have to finish the tutorial first", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(AppIntroduction.this, register.class);
        startActivity(intent);

    }

    @Override
    public void onSkipPressed() {
        super.onSkipPressed();
        Intent intent = new Intent(AppIntroduction.this, register.class);
        startActivity(intent);
    }
}