package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv7);
    }
    public void cv7_qscm(View view){

        startActivity(new Intent(cv7.this,cv7_qscm.class));
    }
    public void cv7_drss(View view){

        startActivity(new Intent(cv7.this,cv7_drss.class));
    }
    public void cv7_pe2(View view){

        startActivity(new Intent(cv7.this,cv7_pe2.class));
    }
    public void cv7_pe3(View view){

        startActivity(new Intent(cv7.this,cv7_pe3.class));
    }
    public void cv7_oe(View view){

        startActivity(new Intent(cv7.this,cv7_oe.class));
    }

}