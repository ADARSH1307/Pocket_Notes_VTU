package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec7);
    }
    public void ec7_cn(View view){

        startActivity(new Intent(ec7.this,ec7_cn.class));
    }
    public void ec7_vd(View view){

        startActivity(new Intent(ec7.this,ec7_vd.class));
    }
    public void ec7_pe2(View view){

        startActivity(new Intent(ec7.this,ec7_pe2.class));
    }
    public void ec7_pe3(View view){

        startActivity(new Intent(ec7.this,ec7_pe3.class));
    }

}