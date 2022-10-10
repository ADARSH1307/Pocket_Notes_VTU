package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse3_dms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse3_dms);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1qdLjCDGKnBdV85a0PaAEzikizDzXBwGH/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1Af5lHDFht_cwovd7x9YLxBBZeY5cSGHV/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1K7PeCiEHiLb0oeMR5Wra-HLn9-S-wYpV/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1h-WEvwXDAlv_GOeyVQu3KYHUfKvmCSIs/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1rQ_68Y-A6FefPauTIJyZyE7CbkrA2rQk/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}