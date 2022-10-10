package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
    }
    public void cse5(View view){

        startActivity(new Intent(sem5.this,cse5.class));
    }
    public void ai5(View view){

        startActivity(new Intent(sem5.this,ai5.class));
    }
    public void ec5(View view){

        startActivity(new Intent(sem5.this,ec5.class));
    }
    public void me5(View view){

        startActivity(new Intent(sem5.this,me5.class));
    }
    public void cv5(View view){

        startActivity(new Intent(sem5.this,cv5.class));
    }
    public void env5(View view){

        startActivity(new Intent(sem5.this,env5.class));
    }


}