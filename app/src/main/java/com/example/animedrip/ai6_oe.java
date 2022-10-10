package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai6_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai6_oe);
    }
    public void ai6_oe_isc(View view){

        startActivity(new Intent(ai6_oe.this,ai6_oe_isc.class));
    }
    public void ai6_oe_ita(View view){

        startActivity(new Intent(ai6_oe.this,ai6_oe_ita.class));
    }
    public void ai6_oe_iwt(View view){

        startActivity(new Intent(ai6_oe.this,ai6_oe_iwt.class));
    }


}