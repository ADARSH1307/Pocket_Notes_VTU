package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv3);
    }
    public void m3(View view){

        startActivity(new Intent(cv3.this,m3.class));
    }
    public void cv3_bmc(View view){

        startActivity(new Intent(cv3.this,cv3_bmc.class));
    }
    public void cv3_bs(View view){

        startActivity(new Intent(cv3.this,cv3_bs.class));
    }
    public void cv3_eg(View view){

        startActivity(new Intent(cv3.this,cv3_bmc.class));
    }
    public void cv3_fm(View view){

        startActivity(new Intent(cv3.this,cv3_fm.class));
    }
    public void cv3_som(View view){

        startActivity(new Intent(cv3.this,cv3_som.class));
    }




}