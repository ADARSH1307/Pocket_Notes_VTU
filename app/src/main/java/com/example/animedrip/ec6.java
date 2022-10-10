package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec6);
    }
    public void ec6_oe(View view){

        startActivity(new Intent(ec6.this,ec6_oe.class));
    }
    public void ec6_pe(View view){

        startActivity(new Intent(ec6.this,ec6_pe.class));
    }
    public void ec6_dc(View view){

        startActivity(new Intent(ec6.this,ec6_dc.class));
    }
    public void ec6_es(View view){

        startActivity(new Intent(ec6.this,ec6_es.class));
    }
    public void ec6_maa(View view){

        startActivity(new Intent(ec6.this,ec6_maa.class));
    }

}