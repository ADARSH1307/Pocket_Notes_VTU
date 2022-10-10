package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec6_pe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec6_pe);
    }
    public void ec6_pe_ann(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_ann.class));
    }
    public void ec6_pe_dssv(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_dssv.class));
    }
    public void ec6_pe_ne(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_ne.class));
    }
    public void ec6_pe_oop(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_oop.class));
    }
    public void ec6_pe_os(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_os.class));
    }
    public void ec6_pe_pap(View view){

        startActivity(new Intent(ec6_pe.this,ec6_pe_pap.class));
    }

}