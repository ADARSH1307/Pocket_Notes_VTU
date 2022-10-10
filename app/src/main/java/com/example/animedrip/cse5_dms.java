package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse5_dms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse5_dms);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/177Jca_fKi6EDg4poH-DOBGXN15dmUm7k/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/175CtvBb_B3EIYfMGfTFKQGnPMOrdELNI/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1Qm1Z95QWYzlw880wpNCaXgplCbs07s69/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1rlm1ZlFgCVs_JawZhzsKEVIzVfHqGLpO/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1CurqYvJgTDJXZcCDP_omprKhVuIWTxz9/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}