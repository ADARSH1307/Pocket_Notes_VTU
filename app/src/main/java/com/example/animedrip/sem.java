package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class sem extends AppCompatActivity {
    private FirebaseAuth FireBaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        FireBaseAuth=FirebaseAuth.getInstance();
    }

    public void sem1(View view){

        startActivity(new Intent(sem.this,sem1.class));
    }
    public void sem2(View view){

        startActivity(new Intent(sem.this,sem2.class));
    }
    public void sem3(View view){

        startActivity(new Intent(sem.this,sem3.class));
    }
    public void sem4(View view){

        startActivity(new Intent(sem.this,sem4.class));
    }
    public void sem5(View view){

        startActivity(new Intent(sem.this,sem5.class));
    }
    public void sem6(View view){

        startActivity(new Intent(sem.this,sem6.class));
    }
    public void sem7(View view){

        startActivity(new Intent(sem.this,sem7.class));
    }
    public void sem8(View view){

        startActivity(new Intent(sem.this,sem8.class));
    }

}