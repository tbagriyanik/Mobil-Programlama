package com.example.mobilprogramlamaornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityH3 extends AppCompatActivity {

    EditText bizimMetin, sinifMetni; //geçici Global nesne
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h3);

        //geçici nesne ile form nesnesi birleşir
        bizimMetin = findViewById(R.id.isim);
        sinifMetni = findViewById(R.id.sinif);
        sonuc = findViewById(R.id.etiket);

        Toast.makeText(this, "Hoş Geldiniz", Toast.LENGTH_SHORT).show();
    }

    public void yap(View view) {
        //Toast yazıp TAB ile tamamlayınız
        Toast.makeText(this,
                "Merhaba " + bizimMetin.getText() + " " + sinifMetni.getText(),
                Toast.LENGTH_SHORT).show();
    }

    public void topla(View view) {
        int a, b, sonucu;
        a = Integer.parseInt(bizimMetin.getText().toString());
        b = Integer.parseInt(sinifMetni.getText().toString());
        //Metni sayı olarak dönüştür
        sonucu = a + b;

        sonuc.setText("Sonuç=" + sonucu);
    }

    public void carp(View view) {
        int a, b, sonucu;
        a = Integer.parseInt(bizimMetin.getText().toString());
        b = Integer.parseInt(sinifMetni.getText().toString());
        //Metni sayı olarak dönüştür
        sonucu = a * b;

        sonuc.setText("Sonuç=" + sonucu);
    }

    public void cikar(View view) {
        int a, b, sonucu;
        a = Integer.parseInt(bizimMetin.getText().toString());
        b = Integer.parseInt(sinifMetni.getText().toString());
        //Metni sayı olarak dönüştür
        sonucu = a - b;

        sonuc.setText("Sonuç=" + sonucu);
    }

    public void bol(View view) {
        Double a, b, sonucu;
        a = Double.parseDouble(bizimMetin.getText().toString());
        b = Double.parseDouble(sinifMetni.getText().toString());
        //Metni sayı olarak dönüştür
        sonucu = a / b;

        sonuc.setText("Sonuç=" + sonucu);
    }

}