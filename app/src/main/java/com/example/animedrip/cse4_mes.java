package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cse4_mes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse4_mes);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1p16TPhMsWRpuQNSVd-Inu2Nbfee3QCuF/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void m2(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1VccxenAnqFL6zZguEduDTK66EI87s_Ml/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m3(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1tf-VdznHjvRpcvSFjfW2GiCCBxD7ihGw/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m4(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1IwS-rR4kyWQf5-wmxaHcUWAgIMXqjpRC/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void m5(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1ubnpACqewCRKtJXJVI8OZ5CzKBdOAhrn/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}