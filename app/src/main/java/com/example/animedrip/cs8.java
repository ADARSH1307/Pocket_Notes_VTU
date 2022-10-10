package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cs8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs8);
    }
    public void cs8_iot(View view){

        startActivity(new Intent(cs8.this,cs8_iot.class));
    }
    public void cs8_map(View view){

        startActivity(new Intent(cs8.this,cs8_map.class));
    }
    public void cs8_mc(View view){

        startActivity(new Intent(cs8.this,cs8_mc.class));
    }
    public void cs8_nd(View view){

        startActivity(new Intent(cs8.this,cs8_nd.class));
    }
    public void cs8_san(View view){

        startActivity(new Intent(cs8.this,cs8_san.class));
    }

}