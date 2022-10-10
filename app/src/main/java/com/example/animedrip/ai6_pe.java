package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai6_pe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai6_pe);
    }
    public void ai6_pe_dmw(View view){

        startActivity(new Intent(ai6_pe.this,ai6_pe_dmw.class));
    }
    public void ai6_pe_dss(View view){

        startActivity(new Intent(ai6_pe.this,ai6_pe_dss.class));
    }
    public void ai6_pe_sec(View view){

        startActivity(new Intent(ai6_pe.this,ai6_pe_sec.class));
    }
    public void ai6_pe_cns(View view){

        startActivity(new Intent(ai6_pe.this,ai6_pe_cns.class));
    }
    public void ai6_pe_acgv(View view){

        startActivity(new Intent(ai6_pe.this,ai6_pe_acgv.class));
    }


}