package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cs7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs7);
    }
    public void cs7_bda(View view){

        startActivity(new Intent(cs7.this,cs7_bda.class));
    }
    public void cs7_pe2(View view){

        startActivity(new Intent(cs7.this,cs7_pe2.class));
    }
    public void cs7_pe3(View view){

        startActivity(new Intent(cs7.this,cs7_pe3.class));
    }
    public void cs7_oe(View view){

        startActivity(new Intent(cs7.this,cs7_oe.class));
    }
    public void cs7_aiml(View view){

        startActivity(new Intent(cs7.this,cs7_aiml.class));
    }

}