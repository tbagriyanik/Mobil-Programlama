package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivityH5 extends AppCompatActivity {

    EditText ad, parola;
    int sayi, sayac;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h5);

        ad = findViewById(R.id.editTextTextPersonName);
        parola = findViewById(R.id.editTextTextPersonName2);

        rnd = new Random();
        sayi = rnd.nextInt(100);
        sayac = 0;
    }

    public void giris(View view) {
        //normalde şifre sadece Veritabanı gibi yerden alınmalı
        if (ad.getText().toString().equals("abc") &&
                parola.getText().toString().equals("123")) {
            Toast.makeText(this, "Başarılı", Toast.LENGTH_SHORT).show();

            //Intent intent = new Intent(this, MainActivity2.class);
            //startActivity(intent);
        } else {
            Toast.makeText(this, "Hata var", Toast.LENGTH_SHORT).show();
        }
    }

    public void kapat(View view) {
        finish();
    }

    public void bil(View view) {
        EditText gelen = findViewById(R.id.sayiGir);
        TextView sonuc = findViewById(R.id.textViewSonuc);
        sayac++;
        if (Integer.parseInt(gelen.getText().toString()) > sayi) {
            sonuc.setText("Büyük girdiniz. Deneme " + sayac);
        } else if (Integer.parseInt(gelen.getText().toString()) < sayi) {
            sonuc.setText("Küçük girdiniz. Deneme " + sayac);
        } else if (Integer.parseInt(gelen.getText().toString()) == sayi) {
            sonuc.setText(sayac + " kerede bildiniz!");

            findViewById(R.id.button1).setEnabled(false);
        }
    }

    public void artir(View view) {
        EditText gelen = findViewById(R.id.sayiGir);
        int deger = Integer.parseInt(gelen.getText().toString()) + 5;
        gelen.setText("" + deger);
    }

    public void eksil(View view) {
        EditText gelen = findViewById(R.id.sayiGir);
        int deger = Integer.parseInt(gelen.getText().toString()) - 5;
        gelen.setText("" + deger);
    }

    public void yeni(View view) {
        sayi = rnd.nextInt(100);
        sayac = 0;
        findViewById(R.id.button1).setEnabled(true);
        EditText gelen = findViewById(R.id.sayiGir);
        gelen.setText("50");
        TextView sonuc = findViewById(R.id.textViewSonuc);
        sonuc.setText("Yeni oyun...");
        Toast.makeText(this, "Yeni Oyun Başladı", Toast.LENGTH_SHORT).show();
    }


}