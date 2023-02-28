package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h2);
        //Toast.makeText("Selam","Başlık",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Bilgilendirme mesajı 1",
                Toast.LENGTH_LONG).show();
    }

    public void mesaj(View view) {

        EditText mk = findViewById(R.id.metinKutusu1);

        Toast kendiMesajimiz = Toast.makeText(getApplicationContext(),
                mk.getText(),
                Toast.LENGTH_LONG);
        kendiMesajimiz.setGravity(Gravity.BOTTOM | Gravity.LEFT,
                0, 0);
        kendiMesajimiz.show();
    }

}