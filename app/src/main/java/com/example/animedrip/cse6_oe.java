package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse6_oe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse6_oe);
    }
    public void cse6_oe_ids(View view){

        startActivity(new Intent(cse6_oe.this,cse6_oe_ids.class));
    }
    public void cse6_oe_ios(View view){

        startActivity(new Intent(cse6_oe.this,cse6_oe_ios.class));
    }
    public void cse6_oe_mad(View view){

        startActivity(new Intent(cse6_oe.this,cse6_oe_mad.class));
    }
    public void cse6_oe_pij(View view){

        startActivity(new Intent(cse6_oe.this,cse6_oe_pij.class));
    }
}