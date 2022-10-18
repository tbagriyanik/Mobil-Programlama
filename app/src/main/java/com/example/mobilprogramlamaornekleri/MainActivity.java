package com.example.mobilprogramlamaornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
}