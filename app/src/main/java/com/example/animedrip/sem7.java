package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7);
    }
    public void cs7(View view){

        startActivity(new Intent(sem7.this,cs7.class));
    }
    public void ai7(View view){

        startActivity(new Intent(sem7.this,ai7.class));
    }
    public void ec7(View view){

        startActivity(new Intent(sem7.this,ec7.class));
    }
    public void me7(View view){

        startActivity(new Intent(sem7.this,me7.class));
    }
    public void cv7(View view){

        startActivity(new Intent(sem7.this,cv7.class));
    }

}