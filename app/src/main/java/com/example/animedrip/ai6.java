package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai6);
    }
    public void ai6_oe(View view){

        startActivity(new Intent(ai6.this,ai6_oe.class));
    }

    public void ai6_pe(View view){

        startActivity(new Intent(ai6.this,ai6_pe.class));
    }
    public void ai6_aat(View view){

        startActivity(new Intent(ai6.this,ai6_aat.class));
    }

    public void ai6_aipv(View view){

        startActivity(new Intent(ai6.this,ai6_aipv.class));
    }
    public void ai6_wamt(View view){

        startActivity(new Intent(ai6.this,ai6_wamt.class));
    }



}