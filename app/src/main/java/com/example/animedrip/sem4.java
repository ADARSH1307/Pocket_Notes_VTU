package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);
    }
    public void cse4(View view){

        startActivity(new Intent(sem4.this,cse4.class));
    }
    public void ec4(View view){

        startActivity(new Intent(sem4.this,ec4.class));
    }
    public void me4(View view){

        startActivity(new Intent(sem4.this,me4.class));
    }
    public void es34(View view){

        startActivity(new Intent(sem4.this,es34.class));
    }
    public void cv4(View view){

        startActivity(new Intent(sem4.this,cv4.class));
    }


}