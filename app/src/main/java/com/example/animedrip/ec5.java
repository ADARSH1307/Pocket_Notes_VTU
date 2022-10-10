package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec5);
    }
    public void ec5_dsp(View view){

        startActivity(new Intent(ec5.this,ec5_dsp.class));
    }
    public void ec5_ew(View view){

        startActivity(new Intent(ec5.this,ec5_ew.class));
    }
    public void ec5_itc(View view){

        startActivity(new Intent(ec5.this,ec5_itc.class));
    }
    public void ec5_pcs(View view){

        startActivity(new Intent(ec5.this,ec5_pcs.class));
    }
    public void ec5_tie(View view){

        startActivity(new Intent(ec5.this,ec5_tie.class));
    }
    public void ec5_vh(View view){

        startActivity(new Intent(ec5.this,ec5_vh.class));
    }
}