package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me7_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me7_oe);
    }
    public void me7_oe_ee(View view){

        startActivity(new Intent(me7_oe.this,me7_oe_ee.class));
    }
    public void me7_oe_ae(View view){

        startActivity(new Intent(me7_oe.this,me7_oe_ae.class));
    }
    public void me7_oe_is(View view){

        startActivity(new Intent(me7_oe.this,me7_oe_is.class));
    }
    public void me7_oe_ot(View view){

        startActivity(new Intent(me7_oe.this,me7_oe_ot.class));
    }

}