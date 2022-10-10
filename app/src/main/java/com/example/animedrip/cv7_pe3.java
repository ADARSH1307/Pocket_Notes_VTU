package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv7_pe3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv7_pe3);
    }
    public void cv7_pe3_ee(View view){

        startActivity(new Intent(cv7_pe3.this,cv7_pe3_ee.class));
    }
    public void cv7_pe3_dcbs(View view){

        startActivity(new Intent(cv7_pe3.this,cv7_pe3_dcbs.class));
    }
    public void cv7_pe3_res(View view){

        startActivity(new Intent(cv7_pe3.this,cv7_pe3_res.class));
    }
    public void cv7_pe3_dhs(View view){

        startActivity(new Intent(cv7_pe3.this,cv7_pe3_dhs.class));
    }
    public void cv7_pe3_utp(View view){

        startActivity(new Intent(cv7_pe3.this,cv7_pe3_utp.class));
    }

}