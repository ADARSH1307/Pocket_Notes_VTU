package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me4);
    }
    public void me45(View view){

        startActivity(new Intent(me4.this,me45.class));
    }
    public void me46(View view){

        startActivity(new Intent(me4.this,me46.class));
    }
    public void me4_at(View view){

        startActivity(new Intent(me4.this,me4_at.class));
    }
    public void me4_fm(View view){

        startActivity(new Intent(me4.this,me4_fm.class));
    }
    public void m4(View view){

        startActivity(new Intent(me4.this,m4.class));
    }
    public void me4_kom(View view){

        startActivity(new Intent(me4.this,me4_kom.class));
    }




}