package com.example.animedrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sem2_cps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2_cps);
    }
    public void m1(View view){

        Uri uri = Uri.parse("https://drive.google.com/file/d/1qoDuhf2GLnRTwLR9mNYxJFqLiHdg1MIS/view");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}