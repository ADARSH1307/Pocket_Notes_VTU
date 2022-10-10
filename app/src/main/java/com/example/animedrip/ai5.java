package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai5);
    }
    public void ai5_alal(View view){

        startActivity(new Intent(ai5.this,ai5_alal.class));
    }
    public void ai5_cgip(View view){

        startActivity(new Intent(ai5.this,ai5_cgip.class));
    }
    public void ai5_dms(View view){

        startActivity(new Intent(ai5.this,ai5_dms.class));
    }
    public void ai5_mei(View view){

        startActivity(new Intent(ai5.this,ai5_mei.class));
    }
    public void ai5_ssa(View view){

        startActivity(new Intent(ai5.this,ai5_ssa.class));
    }
    public void ai5_mlp(View view){

        startActivity(new Intent(ai5.this,ai5_mlp.class));
    }
}