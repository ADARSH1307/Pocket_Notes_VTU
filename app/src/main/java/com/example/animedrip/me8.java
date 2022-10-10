package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me8);
    }
    public void me8_ae(View view){

        startActivity(new Intent(me8.this,me8_ae.class));
    }
    public void me8_cmt(View view){

        startActivity(new Intent(me8.this,me8_cmt.class));
    }
    public void me8_ee(View view){

        startActivity(new Intent(me8.this,me8_ee.class));
    }
    public void me8_fm(View view){

        startActivity(new Intent(me8.this,me8_fm.class));
    }
    public void me8_ndte(View view){

        startActivity(new Intent(me8.this,me8_ndte.class));
    }
    public void me8_t(View view){

        startActivity(new Intent(me8.this,me8_t.class));
    }
    public void me8_td(View view){

        startActivity(new Intent(me8.this,me8_td.class));
    }

}