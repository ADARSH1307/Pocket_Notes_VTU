package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me46);
    }
    public void me46_camd(View view){

        startActivity(new Intent(me46.this,me46_camd.class));
    }
    public void me46_mmm(View view){

        startActivity(new Intent(me46.this,me46_mmm.class));
    }
}