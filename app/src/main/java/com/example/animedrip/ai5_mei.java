package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ai5_mei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai5_mei);

    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/101fFd5_iwv5XV9bNT2U2qv6eQbQsKu_f/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1sxbxnWjidvGHcN6owRYuXScrCitj0c6s/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1tC-p3sdC05pj-kQYPmrXIH4SY4CdLD0Z/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1svvujulVE96kil86BdvYSKuE5vNoqYA7/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1sx_OOxhMUMpSHcsbWiyvzJOt6Vw5b7l8/viewN");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}