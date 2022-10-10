package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cv4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv4);
    }
    public void m4(View view){

        startActivity(new Intent(cv4.this,m4.class));
    }
    public void cv4_ads(View view){

        startActivity(new Intent(cv4.this,cv4_ads.class));
    }
    public void cv4_ah(View view){

        startActivity(new Intent(cv4.this,cv4_ah.class));
    }
    public void cv4_as(View view){

        startActivity(new Intent(cv4.this,cv4_as.class));
    }
    public void cv4_ct(View view){

        startActivity(new Intent(cv4.this,cv4_ct.class));
    }
    public void cv4_wst(View view){

        startActivity(new Intent(cv4.this,cv4_wst.class));
    }
}
