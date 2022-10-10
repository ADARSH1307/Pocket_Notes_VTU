package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me7_pe3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me7_pe3);
    }
    public void me7_pe3_am(View view){

        startActivity(new Intent(me7_pe3.this,me7_pe3_am.class));
    }
    public void me7_pe3_esbc(View view){

        startActivity(new Intent(me7_pe3.this,me7_pe3_esbc.class));
    }
    public void me7_pe3_tp(View view){

        startActivity(new Intent(me7_pe3.this,me7_pe3_tp.class));
    }
    public void me7_pe3_mech(View view){

        startActivity(new Intent(me7_pe3.this,me7_pe3_mech.class));
    }
    public void me7_pe3_pm(View view){

        startActivity(new Intent(me7_pe3.this,me7_pe3_pm.class));
    }

}