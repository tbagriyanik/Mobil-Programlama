package com.example.mobilprogramlamaornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilprogramlamaornekleri.databinding.ActivityMainActivity2H2Binding;

import java.util.ArrayList;

public class MainActivity2_h2 extends AppCompatActivity {

    private ActivityMainActivity2H2Binding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainActivity2H2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Gorsel resim1 = new Gorsel("Beyaz Baykuş", 1, R.drawable.resim1);
        Gorsel resim2 = new Gorsel("Güzel Kelebek", 2, R.drawable.resim2);
        Gorsel resim3 = new Gorsel("Meraklı Çocuklar", 3, R.drawable.resim3);
        Gorsel resim4 = new Gorsel("Kalem Kız", 4, R.drawable.resim4);

        gorselArrayList = new ArrayList<>();
        gorselArrayList.add(resim1);
        gorselArrayList.add(resim2);
        gorselArrayList.add(resim3);
        gorselArrayList.add(resim4);

        binding.imageView.setImageResource(gorselArrayList.get(0).foto);
        binding.textView.setText("Bilgi : \n" + gorselArrayList.get(0).bilgi);
        seciliSiraNo = 0;

    }

    public void geriGit(View view) {
        if (seciliSiraNo > 0) {
            seciliSiraNo--;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi : \n" + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGit(View view) {
        if (seciliSiraNo < gorselArrayList.size() - 1) {
            seciliSiraNo++;
            binding.imageView.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi : \n" + gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void SwipeIle(View view) {
        Intent niyet = new Intent(this, MainActivity2swipe.class);
        startActivity(niyet);
    }

}