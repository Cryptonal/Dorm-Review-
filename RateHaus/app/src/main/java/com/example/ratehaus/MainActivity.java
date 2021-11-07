package com.example.ratehaus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.btn_tuIlmenau)
    Button btn_tuIlmenau;
    @BindView(R.id.btn_uniErfurt)
    Button btn_erfurt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        btn_tuIlmenau.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TuiHauses.class);
            startActivity(intent);
        });

        btn_erfurt.setOnClickListener(v -> {
            Intent intent1 = new Intent( MainActivity.this, UniErfurt.class);
            startActivity(intent1);
        });
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn_tuIlmenau:
//                Intent intent = new Intent(MainActivity.this, TuIlmenau.class);
//                startActivity(intent);
//                break;
//            case R.id.btn_uniErfurt:
//                Intent intent1 = new Intent( MainActivity.this, UniErfurt.class);
//                startActivity(intent1);
//                break;
//            default:
//                Toast.makeText(this, "Please select valid university", Toast.LENGTH_SHORT).show();
//
//        }
//    }
}