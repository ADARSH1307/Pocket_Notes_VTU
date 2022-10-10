package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv7_pe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv7_pe2);
    }
    public void cv7_pe2_toe(View view){

        startActivity(new Intent(cv7_pe2.this,cv7_pe2_toe.class));
    }
    public void cv7_pe2_apc(View view){

        startActivity(new Intent(cv7_pe2.this,cv7_pe2_apc.class));
    }
    public void cv7_pe2_pmc(View view){

        startActivity(new Intent(cv7_pe2.this,cv7_pe2_pmc.class));
    }
    public void cv7_pe2_gwh(View view){

        startActivity(new Intent(cv7_pe2.this,cv7_pe2_gwh.class));
    }
    public void cv7_pe2_ms(View view){

        startActivity(new Intent(cv7_pe2.this,cv7_pe2_ms.class));
    }

}