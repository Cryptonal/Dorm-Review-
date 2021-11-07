package com.example.ratehaus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TuiHauses extends AppCompatActivity {
    @BindView(R.id.btn_hausA)
    Button btn_HausA;
    @BindView(R.id.btn_HausB)
    Button btn_HausB;
    @BindView(R.id.btn_hausC)
    Button btn_HausC;
    @BindView(R.id.btn_HausD)
    Button btn_HausD;
    @BindView(R.id.btn_hausE)
    Button btn_HausE;
    @BindView(R.id.btn_HausH)
    Button btn_HausH;
    @BindView(R.id.btn_hausI)
    Button btn_HausI;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tui_hauses);

        ButterKnife.bind(this);

        btn_HausA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuiHauses.this, TuIlmenau.class);
                intent.putExtra("HausName", "A");
                startActivity(intent);

            }
        });

        btn_HausB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuiHauses.this, TuIlmenau.class);
                intent.putExtra("HausName", "B");
                startActivity(intent);

            }
        });

        btn_HausC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuiHauses.this, TuIlmenau.class);
                intent.putExtra("HausName", "C");
                startActivity(intent);

            }
        });

        btn_HausD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TuiHauses.this, TuIlmenau.class);
                intent.putExtra("HausName", "D");
                startActivity(intent);
            }
        });


    }
}