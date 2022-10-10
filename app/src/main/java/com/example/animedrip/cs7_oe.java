package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cs7_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs7_oe);
    }
    public void cs7_oe_ibda(View view){

        startActivity(new Intent(cs7_oe.this,cs7_oe_ibda.class));
    }
    public void cs7_oe_iai(View view){

        startActivity(new Intent(cs7_oe.this,cs7_oe_iai.class));
    }
    public void cs7_oe_idnf(View view){

        startActivity(new Intent(cs7_oe.this,cs7_oe_idnf.class));
    }
    public void cs7_oe_pap(View view){

        startActivity(new Intent(cs7_oe.this,cs7_oe_pap.class));
    }

}