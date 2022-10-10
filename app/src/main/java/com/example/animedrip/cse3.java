package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse3);
    }
    public void m3(View view){

        startActivity(new Intent(cse3.this,m3.class));
    }
    public void cse3_dsa(View view){

        startActivity(new Intent(cse3.this,cse3_dsa.class));
    }
    public void cse3_ade(View view){

        startActivity(new Intent(cse3.this,cse3_ade.class));
    }
    public void cse3_co(View view){

        startActivity(new Intent(cse3.this,cse3_co.class));
    }
    public void cse3_dms(View view){

        startActivity(new Intent(cse3.this,cse3_dms.class));
    }
    public void cse3_se(View view){

        startActivity(new Intent(cse3.this,cse3_se.class));
    }
}