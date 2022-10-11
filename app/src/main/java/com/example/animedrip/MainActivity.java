package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth FireBaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FireBaseAuth=FirebaseAuth.getInstance();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(FireBaseAuth.getCurrentUser() != null){
                    startActivity(new Intent(MainActivity.this,sem.class));
                    finish();
                }
                else{
                    Intent intent =new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }


            }
        },1700);

    }

    }

