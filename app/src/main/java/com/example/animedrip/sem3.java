package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);

    }
    public void cse3(View view){

        startActivity(new Intent(sem3.this,cse3.class));
    }
    public void me3(View view){

        startActivity(new Intent(sem3.this,me3.class));
    }
    public void ec3(View view){

        startActivity(new Intent(sem3.this,ec3.class));
    }
    public void cv3(View view){

        startActivity(new Intent(sem3.this,cv3.class));
    }
    public void es34(View view){

        startActivity(new Intent(sem3.this,es34.class));
    }


}