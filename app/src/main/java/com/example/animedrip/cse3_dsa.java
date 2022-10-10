package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse3_dsa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse3_dsa);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1tidaYCWCViB0HLFlYwO67-DqkKZEYSq2/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1fRETfX-93zUhDMmdTMOtYQP_RI6Yy6nT/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1HKeL-BMyBWNc0J2q5Gvj2rwun7YU0-Xk/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1FKYPvd2xCSzTmx3MAfOwKQUebKu66SO6/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1GJ0VAlzJLF63IQNwsrccHYu5hzkyyi5l/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}