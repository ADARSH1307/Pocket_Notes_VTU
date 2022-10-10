package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec6_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec6_oe);
    }
    public void ec6_oe_sp(View view){

        startActivity(new Intent(ec6_oe.this,ec6_oe_sp.class));
    }
    public void ec6_oe_ssc(View view){

        startActivity(new Intent(ec6_oe.this,ec6_oe_ssc.class));
    }

}