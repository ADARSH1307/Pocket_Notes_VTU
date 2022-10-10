package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);

    }
    public void sem1_m1(View view){

        startActivity(new Intent(sem1.this,sem1_m1.class));
    }
    public void sem1_phy(View view){

        startActivity(new Intent(sem1.this,sem1_phy.class));
    }
    public void sem1_be(View view){

        startActivity(new Intent(sem1.this,sem1_be.class));
    }
    public void sem1_cv(View view){

        startActivity(new Intent(sem1.this,sem1_cv.class));
    }
    public void sem1_eg(View view){

        startActivity(new Intent(sem1.this,sem1_eg.class));
    }
}