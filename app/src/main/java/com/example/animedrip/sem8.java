package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8);
    }
    public void cs8(View view){

        startActivity(new Intent(sem8.this,cs8.class));
    }
    public void ai8(View view){

        startActivity(new Intent(sem8.this,ai8.class));
    }
    public void ec8(View view){

        startActivity(new Intent(sem8.this,ec8.class));
    }
    public void me8(View view){

        startActivity(new Intent(sem8.this,me8.class));
    }
    public void cv8(View view){

        startActivity(new Intent(sem8.this,cv8.class));
    }


}