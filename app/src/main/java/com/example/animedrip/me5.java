package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me5);
    }
    public void me5_dme(View view){

        startActivity(new Intent(me5.this,me5_dme.class));
    }
    public void me5_dom(View view){

        startActivity(new Intent(me5.this,me5_dom.class));
    }
    public void me5_fpe(View view){

        startActivity(new Intent(me5.this,me5_fpe.class));
    }
    public void me5_mae(View view){

        startActivity(new Intent(me5.this,me5_mae.class));
    }
    public void me5_om(View view){

        startActivity(new Intent(me5.this,me5_om.class));
    }
    public void me5_tb(View view){

        startActivity(new Intent(me5.this,me5_tb.class));
    }



}