package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse5);
    }
    public void cse5_adp(View view){

        startActivity(new Intent(cse5.this,cse5_adp.class));
    }
    public void cse5_atc(View view){

        startActivity(new Intent(cse5.this,cse5_atc.class));
    }
    public void cse5_cns(View view){

        startActivity(new Intent(cse5.this,cse5_cns.class));
    }
    public void cse5_dms(View view){

        startActivity(new Intent(cse5.this,cse5_dms.class));
    }
    public void cse5_mei(View view){

        startActivity(new Intent(cse5.this,cse5_mei.class));
    }
    public void cse5_up(View view){

        startActivity(new Intent(cse5.this,cse5_up.class));
    }
}