package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse6_oe_mad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse6_oe_mad);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1EI-ciQfS4_9MVxhbJub3KzXvkLsiINBy/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1plnaMO4Qi6K8YTKpnWJZyXxC3Lb2y73q/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/14VLlX5c92fe3oh78UG4MilR58xrOQwV4/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1npIbL3Zbiz_8_RNJOKQpJTlqHLxtaMc0/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1pCVY7pAXmjSABSyHgO5IHoqydv8dFQ0v/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}