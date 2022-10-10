package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);
    }
    public void cse6(View view){

        startActivity(new Intent(sem6.this,cse6.class));
    }
    public void ai6(View view){

        startActivity(new Intent(sem6.this,ai6.class));
    }
    public void ec6(View view){

        startActivity(new Intent(sem6.this,ec6.class));
    }
    public void me6(View view){

        startActivity(new Intent(sem6.this,me6.class));
    }
    public void cv6(View view){

        startActivity(new Intent(sem6.this,cv6.class));
    }
    public void is6(View view){

        startActivity(new Intent(sem6.this,is6.class));
    }


}