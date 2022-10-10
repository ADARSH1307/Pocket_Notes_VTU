package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cs7_pe3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs7_pe3);
    }
    public void cs7_pe3_dip(View view){

        startActivity(new Intent(cs7_pe3.this,cs7_pe3_dip.class));
    }
    public void cs7_pe3_nm(View view){

        startActivity(new Intent(cs7_pe3.this,cs7_pe3_nm.class));
    }
    public void cs7_pe3_nlp(View view){

        startActivity(new Intent(cs7_pe3.this,cs7_pe3_nlp.class));
    }
    public void cs7_pe3_cr(View view){

        startActivity(new Intent(cs7_pe3.this,cs7_pe3_cr.class));
    }
    public void cs7_pe3_rpad(View view){

        startActivity(new Intent(cs7_pe3.this,cs7_pe3_rpad.class));
    }

}