package com.example.mobilprogramlamaornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivityH14 extends AppCompatActivity {
    //1.tanımlamalar
    TextView sure;
    EditText bitis;
    Button basla;
    Handler handler;
    Runnable runnable;
    int x = 0;

    Switch secim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h14);

        //2. bağlantı
        sure = findViewById(R.id.textView2);
        bitis = findViewById(R.id.editTextNumber);
        basla = findViewById(R.id.buttonh1);

        bitis.setText("5");

        secim = findViewById(R.id.switch1);
    }

    public void basla(View view) {
        basla.setEnabled(false);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (secim.isChecked()) {
                    if (x < Integer.parseInt(bitis.getText().toString())) x++;
                } else {
                    if (x > 0) x--;
                }

                sure.setText("" + x);
                handler.postDelayed(runnable, 1000);

                if (x <= 0) dur(view);
                if (x >= Integer.parseInt(bitis.getText().toString()))
                    dur(view);

            }
        };
        handler.post(runnable);
    }

    public void dur(View view) {
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            basla.setEnabled(true);
        }
    }

    public void sifirla(View view) {
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            basla.setEnabled(true);
            x = 0;
            sure.setText("" + x);
        }
    }
}
