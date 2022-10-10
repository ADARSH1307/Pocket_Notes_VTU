package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec8);
    }
    public void ec8_bsp(View view){

        startActivity(new Intent(ec8.this,ec8_bsp.class));
    }
    public void ec8_mems(View view){

        startActivity(new Intent(ec8.this,ec8_mems.class));
    }
    public void ec8_ns(View view){

        startActivity(new Intent(ec8.this,ec8_ns.class));
    }
    public void ec8_ocn(View view){

        startActivity(new Intent(ec8.this,ec8_ocn.class));
    }
    public void ec8_re(View view){

        startActivity(new Intent(ec8.this,ec8_re.class));
    }
    public void ec8_wcc(View view){

        startActivity(new Intent(ec8.this,ec8_wcc.class));
    }

}