package com.example.mobilprogramlamaornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH13_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h132);

        Intent niyet = getIntent(); //gelen niyet bilgileri

        TextView sonuc = findViewById(R.id.textView9);

        sonuc.setText(niyet.getStringExtra("isim") +
                niyet.getIntExtra("dogumYili", 1));

    }
}