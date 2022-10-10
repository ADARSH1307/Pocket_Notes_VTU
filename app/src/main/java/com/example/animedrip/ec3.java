package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec3);
    }
    public void m3(View view){

        startActivity(new Intent(ec3.this,m3.class));
    }
    public void ec3_coa(View view){

        startActivity(new Intent(ec3.this,ec3_coa.class));
    }
    public void ec3_dsd(View view){

        startActivity(new Intent(ec3.this,ec3_dsd.class));
    }
    public void ec3_ed(View view){

        startActivity(new Intent(ec3.this,ec3_ed.class));
    }
    public void ec3_na(View view){

        startActivity(new Intent(ec3.this,ec3_na.class));
    }
    public void ec3_nt(View view){

        startActivity(new Intent(ec3.this,ec3_nt.class));
    }
    public void ec3_pei(View view){

        startActivity(new Intent(ec3.this,ec3_pei.class));
    }
}