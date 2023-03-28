package com.example.mobilprogramlamaornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2_h6avatar extends AppCompatActivity {
    ImageView yuz, goz, gozluk, burun, agiz, sac;
    ArrayList<Integer> yuzListesi, gozListesi, gozlukListesi, burunListesi,
            agizListesi, sacListesi;
    int seciliYuz = 0, seciliGoz = 0, seciliGozluk = 0, seciliBurun = 0, seciliSac = 0,
            seciliAgiz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_h6avatar);

        yuz = findViewById(R.id.imageViewYUZ);
        goz = findViewById(R.id.imageViewGOZ);
        gozluk = findViewById(R.id.imageViewGOZLUK);
        sac = findViewById(R.id.imageViewSAC);
        burun = findViewById(R.id.imageViewBURUN);
        agiz = findViewById(R.id.imageViewAGIZ);

        yuzListesi = new ArrayList<>();
        yuzListesi.add(R.drawable.yuz1);
        yuzListesi.add(R.drawable.yuz2);
        yuzListesi.add(R.drawable.yuz3);

        gozListesi = new ArrayList<>();
        gozListesi.add(R.drawable.goz1);
        gozListesi.add(R.drawable.goz2);

        gozlukListesi = new ArrayList<>();
        gozlukListesi.add(R.drawable.gozluk1);
        gozlukListesi.add(R.drawable.gozluk2);
        gozlukListesi.add(R.drawable.bos);

        burunListesi = new ArrayList<>();
        burunListesi.add(R.drawable.burun1);
        burunListesi.add(R.drawable.burun2);

        sacListesi = new ArrayList<>();
        sacListesi.add(R.drawable.sac1);
        sacListesi.add(R.drawable.sac2);
        sacListesi.add(R.drawable.sac3);
        sacListesi.add(R.drawable.bos);

        agizListesi = new ArrayList<>();
        agizListesi.add(R.drawable.agiz1);
        agizListesi.add(R.drawable.agiz2);

    }

    public void yuzOnce(View view) {
        seciliYuz--;
        if (seciliYuz < 0)
            seciliYuz = yuzListesi.size() - 1;
        yuz.setImageResource(yuzListesi.get(seciliYuz));
    }

    public void yuzSonra(View view) {
        seciliYuz++;
        if (seciliYuz > yuzListesi.size() - 1)
            seciliYuz = 0;
        yuz.setImageResource(yuzListesi.get(seciliYuz));
    }

    public void sacOnceki(View view) {
        seciliSac--;
        if (seciliSac < 0)
            seciliSac = sacListesi.size() - 1;
        sac.setImageResource(sacListesi.get(seciliSac));
    }

    public void sacSonra(View view) {
        seciliSac++;
        if (seciliSac > sacListesi.size() - 1)
            seciliSac = 0;
        sac.setImageResource(sacListesi.get(seciliSac));
    }

    public void gozlukOnceki(View view) {
        seciliGozluk--;
        if (seciliGozluk < 0)
            seciliGozluk = gozlukListesi.size() - 1;
        gozluk.setImageResource(gozlukListesi.get(seciliGozluk));
    }

    public void gozlukSonra(View view) {
        seciliGozluk++;
        if (seciliGozluk > gozlukListesi.size() - 1)
            seciliGozluk = 0;
        gozluk.setImageResource(gozlukListesi.get(seciliGozluk));
    }

    public void gozOnceki(View view) {
        seciliGoz--;
        if (seciliGoz < 0)
            seciliGoz = gozListesi.size() - 1;
        goz.setImageResource(gozListesi.get(seciliGoz));
    }

    public void gozSonra(View view) {
        seciliGoz++;
        if (seciliGoz > gozListesi.size() - 1)
            seciliGoz = 0;
        goz.setImageResource(gozListesi.get(seciliGoz));
    }

    public void burunOnceki(View view) {
        seciliBurun--;
        if (seciliBurun < 0)
            seciliBurun = burunListesi.size() - 1;
        burun.setImageResource(burunListesi.get(seciliBurun));
    }

    public void burunSonra(View view) {
        seciliBurun++;
        if (seciliBurun > burunListesi.size() - 1)
            seciliBurun = 0;
        burun.setImageResource(burunListesi.get(seciliBurun));
    }

    public void agizSonraki(View view) {
        seciliAgiz--;
        if (seciliAgiz < 0)
            seciliAgiz = agizListesi.size() - 1;
        agiz.setImageResource(agizListesi.get(seciliAgiz));
    }

    public void agizOnceki(View view) {
        seciliAgiz++;
        if (seciliAgiz > agizListesi.size() - 1)
            seciliAgiz = 0;
        agiz.setImageResource(agizListesi.get(seciliAgiz));
    }
}
