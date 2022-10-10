package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cs7_pe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs7_pe2);
    }
    public void cs7_pe2_sadp(View view){

        startActivity(new Intent(cs7_pe2.this,cs7_pe2_sadp.class));
    }
    public void cs7_pe2_hpc(View view){

        startActivity(new Intent(cs7_pe2.this,cs7_pe2_hpc.class));
    }
    public void cs7_pe2_aca(View view){

        startActivity(new Intent(cs7_pe2.this,cs7_pe2_aca.class));
    }
    public void cs7_pe2_uid(View view){

        startActivity(new Intent(cs7_pe2.this,cs7_pe2_uid.class));
    }

}