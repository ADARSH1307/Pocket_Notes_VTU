package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me7);
    }
    public void me7_ce(View view){

        startActivity(new Intent(me7.this,me7_ce.class));
    }
    public void me7_cadm(View view){

        startActivity(new Intent(me7.this,me7_cadm.class));
    }
    public void me7_pe2(View view){

        startActivity(new Intent(me7.this,me7_pe2.class));
    }
    public void me7_pe3(View view){

        startActivity(new Intent(me7.this,me7_pe3.class));
    }
    public void me7_oe(View view){

        startActivity(new Intent(me7.this,me7_oe.class));
    }

}