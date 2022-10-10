package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me6);
    }
    public void me6_pe(View view){

        startActivity(new Intent(me6.this,me6_pe.class));
    }
    public void me6_dme(View view){

        startActivity(new Intent(me6.this,me6_dme.class));
    }
    public void me6_fee(View view){

        startActivity(new Intent(me6.this,me6_fee.class));
    }
    public void me6_ht(View view){

        startActivity(new Intent(me6.this,me6_ht.class));
    }

}