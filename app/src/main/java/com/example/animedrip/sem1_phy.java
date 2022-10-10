package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sem1_phy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1_phy);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1_gpzg-neyyiyR7Haazpyy4QpEoQlESxe/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1ZcGbBTNS9jJat-S53LGMlsfla4vo1kUE/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1j2ieyyJ3KsQOCIyYGpJ6e1KmNhtDSwI-/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1xNgZg0hdf1bNhHnza52vumHR8cvj-FPp/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1qQtoU2Ac7UZJ35IR1FgjgOS6E_ez4et7/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



}