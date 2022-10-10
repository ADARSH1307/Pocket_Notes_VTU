package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse4);
    }
    public void es34(View view){

        startActivity(new Intent(cse4.this,es34.class));
    }
    public void cse4_daa(View view){

        startActivity(new Intent(cse4.this,cse4_daa.class));
    }
    public void cse4_dc(View view){

        startActivity(new Intent(cse4.this,cse4_dc.class));
    }
    public void cse4_mes(View view){

        startActivity(new Intent(cse4.this,cse4_mes.class));
    }

    public void cse4_ooc(View view){

        startActivity(new Intent(cse4.this,cse4_ooc.class));
    }
    public void cse4_os(View view){

        startActivity(new Intent(cse4.this,cse4_os.class));
    }
    public void m4(View view){

        startActivity(new Intent(cse4.this,m4.class));
    }

}