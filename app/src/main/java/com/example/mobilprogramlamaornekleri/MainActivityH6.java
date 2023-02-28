package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH6 extends AppCompatActivity {
    EditText kilo, boy;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h6);

        kilo = findViewById(R.id.editTextTextPersonName);
        boy = findViewById(R.id.editTextTextPersonName2);
        sonuc = findViewById(R.id.textView3);
    }

    public void hesapla(View view) {
        Double k, b, s;
        k = Double.parseDouble(kilo.getText().toString());
        b = Double.parseDouble(boy.getText().toString());
        s = k / (b * b);
        if (s < 19) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " zayıfs" +
                    "ınız... 👶");
        } else if (s >= 19 && s < 25) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " normalsiniz... 👨");
        } else if (s >= 25 && s < 30) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " normal üstünde... 🦳");
        } else if (s >= 30 && s < 40) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " obezsiniz... 👳️");
        } else if (s >= 40 && s < 50) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " morbit obezsiniz... 🤶");
        } else if (s >= 50) {
            sonuc.setText("Durumunuz " + String.format("%.2f", s) + " süper obezsiniz... 👨‍🌾");
        }
    }

}