package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv6_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv6_oe);
    }
    public void cv6_oe_ohs(View view){

        startActivity(new Intent(cv6_oe.this,cv6_oe_ohs.class));
    }
    public void cv6_oe_rsg(View view){

        startActivity(new Intent(cv6_oe.this,cv6_oe_rsg.class));
    }
    public void cv6_oe_scce(View view){

        startActivity(new Intent(cv6_oe.this,cv6_oe_scce.class));
    }
    public void cv6_oe_te(View view){

        startActivity(new Intent(cv6_oe.this,cv6_oe_te.class));
    }

}