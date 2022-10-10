package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class is6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is6);
    }
    public void is6_fs(View view){

        startActivity(new Intent(is6.this,is6_fs.class));
    }
    public void is6_st(View view){

        startActivity(new Intent(is6.this,is6_st.class));
    }
    public void is6_wtap(View view){

        startActivity(new Intent(is6.this,is6_wtap.class));
    }
    public void cse6_pe(View view){

        startActivity(new Intent(is6.this,cse6_pe.class));
    }
    public void cse6_oe(View view){

        startActivity(new Intent(is6.this,cse6_oe.class));
    }

}