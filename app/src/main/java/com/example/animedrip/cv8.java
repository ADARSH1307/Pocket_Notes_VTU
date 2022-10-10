package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv8);
    }
    public void cv8_afe(View view){

        startActivity(new Intent(cv8.this,cv8_afe.class));
    }
    public void cv8_be(View view){

        startActivity(new Intent(cv8.this,cv8_be.class));
    }
    public void cv8_dpsc(View view){

        startActivity(new Intent(cv8.this,cv8_dpsc.class));
    }
    public void cv8_pd(View view){

        startActivity(new Intent(cv8.this,cv8_pd.class));
    }
    public void cv8_ps(View view){

        startActivity(new Intent(cv8.this,cv8_ps.class));
    }
    public void cv8_rar(View view){

        startActivity(new Intent(cv8.this,cv8_rar.class));
    }

}