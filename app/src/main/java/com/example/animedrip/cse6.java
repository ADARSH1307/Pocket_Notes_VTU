package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse6);
    }
    public void cse6_oe(View view){

        startActivity(new Intent(cse6.this,cse6_oe.class));
    }
    public void cse6_pe(View view){

        startActivity(new Intent(cse6.this,cse6_pe.class));
    }
    public void cse6_cgv(View view){

        startActivity(new Intent(cse6.this,cse6_cgv.class));
    }
    public void cse6_ssc(View view){

        startActivity(new Intent(cse6.this,cse6_ssc.class));
    }
    public void cse6_wta(View view){

        startActivity(new Intent(cse6.this,cse6_wta.class));
    }
}