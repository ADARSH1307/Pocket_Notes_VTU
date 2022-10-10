package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse3_se extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse3_se);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1eKB0MPwedwrx9lfq1brIDjCNs1dhB-5b/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1Wfkc8NDuG0AJBSdt_1ZAIwnEM5WkuN1y/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1ZZ47raW11Lvq3Y3RlhxPYGkaDikyOcQ2/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1psTmF3r56QT-_6kCCEtbz41v79QaAt6C/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/12eIgCE_ff5-aP44ibtW7q9Jzfp-tfFTM/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}