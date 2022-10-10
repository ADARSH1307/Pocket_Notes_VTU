package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv7_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv7_oe);
    }
    public void cv7_oe_fem(View view){

        startActivity(new Intent(cv7_oe.this,cv7_oe_fem.class));
    }
    public void cv7_oe_nma(View view){

        startActivity(new Intent(cv7_oe.this,cv7_oe_nma.class));
    }
    public void cv7_oe_epm(View view){

        startActivity(new Intent(cv7_oe.this,cv7_oe_epm.class));
    }

}