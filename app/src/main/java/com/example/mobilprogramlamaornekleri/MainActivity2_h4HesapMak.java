package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2_h4HesapMak extends AppCompatActivity {
    Button tus0, tus1, tus2, tus3, tus4, tus5, tus6, tus7, tus8, tus9, virgul;
    Button topla, cikar, carp, bol, hesap;
    TextView sonuc1, sonuc2, debugText;

    EditText sayiA, sayiB;
    Button topla2, cikar2, carp2, bol2;

    Double sayi1 = 0.0, sayi2 = 0.0;
    String islem = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_h4_hesap_mak);

        tus0 = findViewById(R.id.button_0);
        tus1 = findViewById(R.id.button_1);
        tus2 = findViewById(R.id.button_2);
        tus3 = findViewById(R.id.button_3);
        tus4 = findViewById(R.id.button_4);
        tus5 = findViewById(R.id.button_5);
        tus6 = findViewById(R.id.button_6);
        tus7 = findViewById(R.id.button_7);
        tus8 = findViewById(R.id.button_8);
        tus9 = findViewById(R.id.button_9);
        virgul = findViewById(R.id.button_Virgul);

        topla = findViewById(R.id.button_Ekle);
        cikar = findViewById(R.id.button_Cikar);
        carp = findViewById(R.id.button_Carp);
        bol = findViewById(R.id.button_Bol);
        hesap = findViewById(R.id.button_Enter);

        sonuc1 = findViewById(R.id.textViewSonuc1);
        debugText = findViewById(R.id.textViewDebug);

        topla2 = findViewById(R.id.button_topla2);
        cikar2 = findViewById(R.id.button_cikar2);
        carp2 = findViewById(R.id.button_carp2);
        bol2 = findViewById(R.id.button_bol2);

        sayiA = findViewById(R.id.editText_sayi1);
        sayiB = findViewById(R.id.editText_sayi2);

        sonuc2 = findViewById(R.id.textView_sonuc2);

        topla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sonuc;
                sonuc =
                        Double.parseDouble(sayiA.getText().toString()) + Double.parseDouble(sayiB.getText().toString());
                sonuc2.setText("Sonuç: " + sonuc + "");
            }
        });

        cikar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sonuc;
                sonuc =
                        Double.parseDouble(sayiA.getText().toString()) - Double.parseDouble(sayiB.getText().toString());
                sonuc2.setText("Sonuç: " + sonuc + "");
            }
        });

        carp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sonuc;
                sonuc =
                        Double.parseDouble(sayiA.getText().toString()) * Double.parseDouble(sayiB.getText().toString());
                sonuc2.setText("Sonuç: " + sonuc + "");
            }
        });

        bol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sonuc;
                sonuc =
                        Double.parseDouble(sayiA.getText().toString()) / Double.parseDouble(sayiB.getText().toString());
                sonuc2.setText("Sonuç: " + sonuc + "");
            }
        });

        //ilk programı
        tus0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!sonuc1.getText().equals("0"))
                    sonuc1.setText(sonuc1.getText() + "0");
            }
        });

        tus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("1");
                else
                    sonuc1.setText(sonuc1.getText() + "1");
            }
        });

        tus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("2");
                else
                    sonuc1.setText(sonuc1.getText() + "2");
            }
        });

        tus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("3");
                else
                    sonuc1.setText(sonuc1.getText() + "3");
            }
        });

        tus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("4");
                else
                    sonuc1.setText(sonuc1.getText() + "4");
            }
        });

        tus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("5");
                else
                    sonuc1.setText(sonuc1.getText() + "5");
            }
        });

        tus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("6");
                else
                    sonuc1.setText(sonuc1.getText() + "6");
            }
        });

        tus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("7");
                else
                    sonuc1.setText(sonuc1.getText() + "7");
            }
        });

        tus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("8");
                else
                    sonuc1.setText(sonuc1.getText() + "8");
            }
        });

        tus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc1.getText().equals("0"))
                    sonuc1.setText("9");
                else
                    sonuc1.setText(sonuc1.getText() + "9");
            }
        });

        virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!sonuc1.getText().toString().contains("."))
                    sonuc1.setText(sonuc1.getText() + ".");
            }
        });

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islem.equals(""))
                    sayi1 = Double.parseDouble(sonuc1.getText().toString());
                else
                    sayi2 = Double.parseDouble(sonuc1.getText().toString());

                sonuc1.setText("0");
                islem = "topla";

                debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
            }
        });

        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islem.equals(""))
                    sayi1 = Double.parseDouble(sonuc1.getText().toString());
                else
                    sayi2 = Double.parseDouble(sonuc1.getText().toString());

                sonuc1.setText("0");
                islem = "cikar";

                debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islem.equals(""))
                    sayi1 = Double.parseDouble(sonuc1.getText().toString());
                else
                    sayi2 = Double.parseDouble(sonuc1.getText().toString());

                sonuc1.setText("0");
                islem = "carp";

                debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islem.equals(""))
                    sayi1 = Double.parseDouble(sonuc1.getText().toString());
                else
                    sayi2 = Double.parseDouble(sonuc1.getText().toString());

                sonuc1.setText("0");
                islem = "bol";

                debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
            }
        });

        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (islem.equals(""))
                    sayi1 = Double.parseDouble(sonuc1.getText().toString());
                else
                    sayi2 = Double.parseDouble(sonuc1.getText().toString());

                switch (islem) {
                    case "topla":
                        sonuc1.setText((sayi1 + sayi2) + "");
                        break;
                    case "cikar":
                        sonuc1.setText((sayi1 - sayi2) + "");
                        break;
                    case "carp":
                        sonuc1.setText((sayi1 * sayi2) + "");
                        break;
                    case "bol":
                        sonuc1.setText((sayi1 / sayi2) + "");
                        break;
                }
                //sayi1 = Double.parseDouble(sonuc1.getText().toString());
                islem = "";

                debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
            }
        });

    }

    public void temizle(View view) {
        sonuc1.setText("0");
        sayi1 = 0.0;
        sayi2 = 0.0;
        islem = "";

        debugText.setText(sayi1 + " " + sayi2 + " "+ islem);
    }
}