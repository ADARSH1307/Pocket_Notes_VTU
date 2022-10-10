package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class es34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es34);
    }
    public void es34_coi(View view){

        startActivity(new Intent(es34.this,es34_coi.class));
    }
    public void es34_kan(View view){

        startActivity(new Intent(es34.this,es34_kan.class));
    }
    public void es34_kan2(View view){

        startActivity(new Intent(es34.this,es34_kan2.class));
    }
}