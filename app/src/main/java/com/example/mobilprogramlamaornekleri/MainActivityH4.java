package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH4 extends AppCompatActivity {
    TextView snc;
    int sayac = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h4);

        snc = findViewById(R.id.textView);
    }

    public void art(View view) {
        sayac++;
        snc.setText("" + sayac);
    }

    public void azal(View view) {
        sayac--;
        snc.setText("" + sayac);
    }

    public void sifir(View view) {
        sayac = 0;
        snc.setText("" + sayac);
    }
}