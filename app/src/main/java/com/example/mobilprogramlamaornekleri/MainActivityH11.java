package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH11 extends AppCompatActivity {
    TextView sayi, carp, forLabel;
    EditText say1, say2, say3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    public void saydır(View V) {
        // 1. ÖRNEK
        sayi = findViewById(R.id.textViewSonucMetni);  // 1.ÖRNEK
        sayi.setText(""); //önce içini temizleyelim
        for (int i = 0; i <= 10; i++) {
            sayi.setText(sayi.getText().toString() + " " + i);
            // i, j, k, l eski alışkanlık
        }
    }

    public void carpim(View view) {
        // 2. ÖRNEK
        carp = findViewById(R.id.textView2);  // 2.ÖRNEK
        carp.setText(""); //önce içini temizleyelim
        for (int i = 1; i <= 5; i++) {
            carp.setText(carp.getText().toString() + "\n" + i + " x 5 =" + i * 5);
            // i, j, k, l eski alışkanlık
        }
    }

    public void forBB(View view) {
        // 3. ÖRNEK
        say1 = findViewById(R.id.editTextTextPersonName);
        say2 = findViewById(R.id.editTextNumber);
        say3 = findViewById(R.id.editTextNumber2);
        forLabel = findViewById(R.id.textView3); //3.ÖRNEK
        forLabel.setText(""); //önce içini silelim
        if (Integer.parseInt(say1.getText().toString()) < Integer.parseInt(say2.getText().toString()))
            for (int i = Integer.parseInt(say1.getText().toString());
                 i <= Integer.parseInt(say2.getText().toString());
                 i += Integer.parseInt(say3.getText().toString())) {
                forLabel.setText(forLabel.getText().toString() + " " + i);
            }
        else
            for (int i = Integer.parseInt(say1.getText().toString());
                 i >= Integer.parseInt(say2.getText().toString());
                 i -= Integer.parseInt(say3.getText().toString())) {
                forLabel.setText(forLabel.getText().toString() + " " + i);
            }
    }

    public void whileIle(View view) {
        //4. ÖRNEK
        TextView sonuc = findViewById(R.id.textView4);

        sonuc.setText("");
        int sayac = 0;    //başlangıç
        while (sayac <= 10) {
            sonuc.setText(sonuc.getText().toString() + " " + sayac);
            sayac++;
        }
    }
}

