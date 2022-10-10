package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv6_pe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv6_pe);
    }
    public void cv6_pe_abm(View view){

        startActivity(new Intent(cv6_pe.this,cv6_pe_abm.class));
    }
    public void cv6_pe_git(View view){

        startActivity(new Intent(cv6_pe.this,cv6_pe_git.class));
    }
    public void cv6_pe_mmsa(View view){

        startActivity(new Intent(cv6_pe.this,cv6_pe_mmsa.class));
    }
    public void cv6_pe_rhta(View view){

        startActivity(new Intent(cv6_pe.this,cv6_pe_swm.class));
    }
    public void cv6_pe_swm(View view){

        startActivity(new Intent(cv6_pe.this,cv6_pe_swm.class));
    }

}