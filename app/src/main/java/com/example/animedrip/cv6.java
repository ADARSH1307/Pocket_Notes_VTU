package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv6);
    }
    public void cv6_age(View view){

        startActivity(new Intent(cv6.this,cv6_age.class));
    }
    public void cv6_dsse(View view){

        startActivity(new Intent(cv6.this,cv6_dsse.class));
    }
    public void cv6_hie(View view){

        startActivity(new Intent(cv6.this,cv6_hie.class));
    }
    public void cv6_oe(View view){

        startActivity(new Intent(cv6.this,cv6_oe.class));
    }
    public void cv6_pe(View view){

        startActivity(new Intent(cv6.this,cv6_pe.class));
    }


}