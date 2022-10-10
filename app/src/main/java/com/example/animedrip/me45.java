package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me45);
    }
    public void me45_mcf(View view){

        startActivity(new Intent(me45.this,me45_mcf.class));
    }
    public void me45_mcw(View view){

        startActivity(new Intent(me45.this,me45_mcw.class));
    }
}