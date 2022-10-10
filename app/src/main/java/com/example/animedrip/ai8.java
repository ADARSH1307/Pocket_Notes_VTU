package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai8);
    }
    public void ai8_ahc(View view){

        startActivity(new Intent(ai8.this,ai8_ahc.class));
    }
    public void ai8_aia(View view){

        startActivity(new Intent(ai8.this,ai8_aia.class));
    }
    public void ai8_bda(View view){

        startActivity(new Intent(ai8.this,ai8_bda.class));
    }
    public void ai8_mnnl(View view){

        startActivity(new Intent(ai8.this,ai8_mnnl.class));
    }
    public void ai8_sms(View view){

        startActivity(new Intent(ai8.this,ai8_sms.class));
    }


}