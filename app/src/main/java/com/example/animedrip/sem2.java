package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
    }
    public void sem2_m2(View view){

        startActivity(new Intent(sem2.this,sem2_m2.class));
    }
    public void sem2_chem(View view){

        startActivity(new Intent(sem2.this,sem2_chem.class));
    }
    public void sem2_be(View view){

        startActivity(new Intent(sem2.this,sem2_be.class));
    }
    public void sem2_cps(View view){

        startActivity(new Intent(sem2.this,sem2_cps.class));
    }
    public void sem2_me(View view){

        startActivity(new Intent(sem2.this,sem2_me.class));
    }


}