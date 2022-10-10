package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse6_pe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse6_pe);
    }
    public void cse6_pe_ajj(View view){

        startActivity(new Intent(cse6_pe.this,cse6_pe_ajj.class));
    }
    public void cse6_pe_cca(View view){

        startActivity(new Intent(cse6_pe.this,cse6_pe_cca.class));
    }
    public void cse6_pe_dmdw(View view){

        startActivity(new Intent(cse6_pe.this,cse6_pe_dmdw.class));
    }
    public void cse6_pe_oomd(View view){

        startActivity(new Intent(cse6_pe.this,cse6_pe_oomd.class));
    }
    public void cse6_pe_sms(View view){

        startActivity(new Intent(cse6_pe.this,cse6_pe_sms.class));
    }
}