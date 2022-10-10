package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec7_pe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec7_pe2);
    }
    public void ec7_pe2_rts(View view){

        startActivity(new Intent(ec7_pe2.this,ec7_pe2_rts.class));
    }
    public void ec7_pe2_sc(View view){

        startActivity(new Intent(ec7_pe2.this,ec7_pe2_sc.class));
    }
    public void ec7_pe2_dip(View view){

        startActivity(new Intent(ec7_pe2.this,ec7_pe2_dip.class));
    }
    public void ec7_pe2_dsc(View view){

        startActivity(new Intent(ec7_pe2.this,ec7_pe2_dsc.class));
    }
    public void ec7_pe2_dspa(View view){

        startActivity(new Intent(ec7_pe2.this,ec7_pe2_dspa.class));
    }

}