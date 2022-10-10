package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ai7_pe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai7_pe2);
    }
    public void ai7_pe2_cs(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_cs.class));
    }
    public void ai7_pe2_sp(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_sp.class));
    }
    public void ai7_pe2_ba(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_ba.class));
    }
    public void ai7_pe2_pc(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_pc.class));
    }
    public void ai7_pe2_hci(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_hci.class));
    }
    public void ai7_pe2_kde(View view){

        startActivity(new Intent(ai7_pe2.this,ai7_pe2_kde.class));
    }

}