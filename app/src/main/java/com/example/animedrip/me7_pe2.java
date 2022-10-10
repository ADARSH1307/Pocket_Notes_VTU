package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me7_pe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me7_pe2);
    }
    public void me7_pe2_dm(View view){

        startActivity(new Intent(me7_pe2.this,me7_pe2_dm.class));
    }
    public void me7_pe2_ar(View view){

        startActivity(new Intent(me7_pe2.this,me7_pe2_ar.class));
    }
    public void me7_pe2_cfd(View view){

        startActivity(new Intent(me7_pe2.this,me7_pe2_cfd.class));
    }
    public void me7_pe2_tqm(View view){

        startActivity(new Intent(me7_pe2.this,me7_pe2_tqm.class));
    }
    public void me7_pe2_or(View view){

        startActivity(new Intent(me7_pe2.this,me7_pe2_or.class));
    }

}