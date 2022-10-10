package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec4);
    }
    public void m4(View view){

        startActivity(new Intent(ec4.this,m4.class));
    }
    public void ec4_ac(View view){

        startActivity(new Intent(ec4.this,ec4_ac.class));
    }
    public void ec4_cs(View view){

        startActivity(new Intent(ec4.this,ec4_cs.class));
    }
    public void ec4_esla(View view){

        startActivity(new Intent(ec4.this,ec4_esla.class));
    }
    public void ec4_na(View view){

        startActivity(new Intent(ec4.this,ec4_na.class));
    }
    public void ec4_pei(View view){

        startActivity(new Intent(ec4.this,ec4_pei.class));
    }
    public void ec4_coa(View view){

        startActivity(new Intent(ec4.this,ec4_coa.class));
    }



}