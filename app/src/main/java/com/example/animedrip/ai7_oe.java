package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai7_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai7_oe);
    }
    public void ai7_oe_ibi(View view){

        startActivity(new Intent(ai7_oe.this,ai7_oe_ibi.class));
    }
    public void ai7_oe_icc(View view){

        startActivity(new Intent(ai7_oe.this,ai7_oe_icc.class));
    }
    public void ai7_oe_ibm(View view){

        startActivity(new Intent(ai7_oe.this,ai7_oe_ibm.class));
    }

}