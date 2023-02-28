package com.example.mobilprogramlamaornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivityH13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h13);
    }

    public void ucgen1(View view) {
        //1.örnek Ters Üçgen yapımı
        TextView cizim = findViewById(R.id.textView2);
        cizim.setText(" ");//önce içini sildik
        int i, j, k;
        for (i = 10; i > 0; i--) {
            for (j = i; j < 10; j++) {
                cizim.setText(cizim.getText() + " ");
            }
            for (k = 1; k <= i; k++) {
                cizim.setText(cizim.getText() + "⭐");
            }
            cizim.setText(cizim.getText() + "\n ");
        }
        for (i = 2; i <= 10; i++) {
            for (j = i; j < 10; j++) {
                cizim.setText(cizim.getText() + " ");
            }
            for (k = 1; k <= i; k++) {
                cizim.setText(cizim.getText() + "⭐");
            }
            cizim.setText(cizim.getText() + "\n ");
        }
    }

    public void rasgele(View view) {
        TextView tv1, tv2, tv3;
        tv1 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView4);
        tv3 = findViewById(R.id.textView5);
        Random rnd = new Random();
        int sayi1 = rnd.nextInt(10);//0-9
        int sayi2 = rnd.nextInt(10);
        tv1.setText(sayi1 + "");
        tv2.setText(sayi2 + "");
        int toplam = sayi1 + sayi2;
        tv3.setText(toplam + "");
        if (toplam == 7)
            Toast.makeText(this, "Kazandınız",
                    Toast.LENGTH_SHORT).show();
    }

    public void gonder(View view) {
        //diğer forma bilgi yollama

        EditText mk = findViewById(R.id.editTextTextPersonName);

        Intent niyet = new Intent(this, MainActivityH13_2.class);
        niyet.putExtra("isim", mk.getText().toString());
        niyet.putExtra("dogumYili", 1990);
        //diğer sayfaya geçerken parametre veri yollama
        //string olmak zorunda değil
        startActivity(niyet);
    }

}