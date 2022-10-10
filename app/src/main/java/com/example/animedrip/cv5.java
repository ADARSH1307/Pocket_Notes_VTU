package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv5);
    }
    public void cv5_ais(View view){

        startActivity(new Intent(cv5.this,cv5_ais.class));
    }
    public void cv5_bge(View view){

        startActivity(new Intent(cv5.this,cv5_bge.class));
    }
    public void cv5_cme(View view){

        startActivity(new Intent(cv5.this,cv5_cme.class));
    }
    public void cv5_drse(View view){

        startActivity(new Intent(cv5.this,cv5_drse.class));
    }
    public void cv5_he(View view){

        startActivity(new Intent(cv5.this,cv5_he.class));
    }
    public void cv5_mww(View view){

        startActivity(new Intent(cv5.this,cv5_mww.class));
    }


}