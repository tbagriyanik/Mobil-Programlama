package com.example.mobilprogramlamaornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilprogramlamaornekleri.databinding.ActivityMainActivity2H2Binding;

import java.util.ArrayList;

public class MainActivity2_h2 extends AppCompatActivity {

    // Mobil Programlama Kitabı - 242. sayfa 11.uygulama
    private ActivityMainActivity2H2Binding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;


    // https://medium.com/quick-code/pinch-to-zoom-with-multi-touch-gestures-in-android-d6392e4bf52d
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;

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

        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f));
            binding.imageView.setScaleX(mScaleFactor);
            binding.imageView.setScaleY(mScaleFactor);
            return true;
        }
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
        // https://www.geeksforgeeks.org/image-slider-in-android-using-viewpager/
        Intent niyet = new Intent(this, MainActivity2swipe.class);
        startActivity(niyet);
    }

}