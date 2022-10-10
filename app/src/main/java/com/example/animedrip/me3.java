package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class me3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me3);
    }
    public void m3(View view){

        startActivity(new Intent(me3.this,m3.class));
    }
    public void me3_bt(View view){

        startActivity(new Intent(me3.this,me3_bt.class));
    }
    public void me3_mcf(View view){

        startActivity(new Intent(me3.this,me3_mcf.class));
    }
    public void me3_mcw(View view){

        startActivity(new Intent(me3.this,me3_mcw.class));
    }
    public void me3_mmm(View view){

        startActivity(new Intent(me3.this,me3_mmm.class));
    }
    public void me3_mom(View view){

        startActivity(new Intent(me3.this,me3_mom.class));
    }
    public void me3_ms(View view){

        startActivity(new Intent(me3.this,me3_ms.class));
    }


}