package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse5_atc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse5_atc);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1JDW-yfXHxhBzRBe8vIfDL0ueRzcBstCg/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/19w7iKBej3R16OG-B0jFOWj-VkybDy3o0/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/19w7iKBej3R16OG-B0jFOWj-VkybDy3o0/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1SKeGQDzNzJepZycPmfK69q2lnb6G8AkY/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1LztYBNCahH98_Ffeipocxhxi9PEWlZ2N/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}