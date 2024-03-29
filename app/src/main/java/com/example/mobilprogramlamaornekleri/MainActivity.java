package com.example.mobilprogramlamaornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void h1(View view) {
        Intent i = new Intent(this, MainActivityH1.class);
        startActivity(i);
    }

    public void h2(View view) {
        Intent i = new Intent(this, MainActivityH2.class);
        startActivity(i);
    }

    public void h3(View view) {
        Intent i = new Intent(this, MainActivityH3.class);
        startActivity(i);
    }

    public void h4(View view) {
        Intent i = new Intent(this, MainActivityH4.class);
        startActivity(i);
    }

    public void h5(View view) {
        Intent i = new Intent(this, MainActivityH5.class);
        startActivity(i);
    }

    public void h6(View view) {
        Intent i = new Intent(this, MainActivityH6.class);
        startActivity(i);
    }

    public void h11(View view) {
        Intent i = new Intent(this, MainActivityH11.class);
        startActivity(i);
    }

    public void h13(View view) {
        Intent i = new Intent(this, MainActivityH13.class);
        startActivity(i);
    }

    public void h14(View view) {
        Intent i = new Intent(this, MainActivityH14.class);
        startActivity(i);
    }

    public void h15(View view) {
        Intent i = new Intent(this, MainActivityH15.class);
        startActivity(i);
    }

    public void h18(View view) {
        Intent i = new Intent(this, MainActivityH18.class);
        startActivity(i);
    }

    public void h2_1(View view) {
        Intent i = new Intent(this, MainActivity2_h1.class);
        startActivity(i);
    }

    public void h2_2(View view) {
        Intent i = new Intent(this, MainActivity2_h2.class);
        startActivity(i);
    }

    public void h2_3(View view) {
        Intent i = new Intent(this, MainActivity2_h3havaDurumu.class);
        startActivity(i);
    }

    public void h2_4(View view) {
        Intent i = new Intent(this, MainActivity2_h4HesapMak.class);
        startActivity(i);
    }

    public void h2_6(View view) {
        Intent i = new Intent(this, MainActivity2_h6avatar.class);
        startActivity(i);
    }
}