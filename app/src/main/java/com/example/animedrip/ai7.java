package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai7);
    }
    public void ai7_rpa(View view){

        startActivity(new Intent(ai7.this,ai7_rpa.class));
    }
    public void ai7_iot(View view){

        startActivity(new Intent(ai7.this,ai7_iot.class));
    }
    public void ai7_oe(View view){

        startActivity(new Intent(ai7.this,ai7_oe.class));
    }
    public void ai7_pe2(View view){

        startActivity(new Intent(ai7.this,ai7_pe2.class));
    }

}