package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me6_pe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me6_pe);
    }
    public void me6_pe_cmt(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_cmt.class));
    }
    public void me6_pe_ed(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_ed.class));
    }
    public void me6_pe_ntm(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_ntm.class));
    }
    public void me6_pe_rac(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_rac.class));
    }
    public void me6_pe_toe(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_toe.class));
    }
    public void me6_pe_vne(View view){

        startActivity(new Intent(me6_pe.this,me6_pe_vne.class));
    }

}