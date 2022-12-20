package com.example.mobilprogramlamaornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityH15 extends AppCompatActivity {

    ImageButton kabin, kapi;

    int hangiKat = 3;
    boolean kabinHareketliMi = false;   //hareket ederken çağrı düğmeleri çalışamaz
    boolean kapiHareketliMi = false;    //hareket ederken tekrar çalışamasın
    int birimKatYuksekligi = 575;   //kat yüksekliği
    int kabinHizi = 1500;           //1500 milisaniye

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h15);

        kabin = findViewById(R.id.imageButton);
        kapi = findViewById(R.id.imageButton3);
    }

    public void kabinHareketEt(int kacKatGidecek, int yon) {
        kabin.animate().translationYBy(birimKatYuksekligi * yon * kacKatGidecek).
                setStartDelay(500).
                withStartAction(    //hareket öncesi tetiklenir
                        new Runnable() {
                            @Override
                            public void run() {
                                kabinHareketliMi = true;
                            }
                        }
                ).withEndAction(   //hareket sonrası tetiklenir
                        new Runnable() {
                            @Override
                            public void run() {
                                kabinHareketliMi = false;

                                //artık kabin hedefe ulaştı ise
                                kapiAcKapa();
                            }
                        }
                ).setDuration(kabinHizi * kacKatGidecek);
        kapi.animate().translationYBy(birimKatYuksekligi * yon * kacKatGidecek).
                setStartDelay(500).setDuration(kabinHizi * kacKatGidecek);
        //kapı ve kabin aynı anda hareket etmeli, sanki gruplanmış gibi
    }

    private void kapiAcKapa() {
        kapi.animate().scaleX(0.1f).translationX(-220).
                setStartDelay(20).setDuration(500).
                withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        kapiHareketliMi = true;
                    }
                }).
                withEndAction(new Runnable() {
                                  @Override
                                  public void run() {
                                      kapiHareketliMi = false;
                                      kapi.animate().scaleX(1f).translationX(0).
                                              setStartDelay(1000).  //binmeye fırsat için gecikme
                                              withStartAction(new Runnable() {
                                                  @Override
                                                  public void run() {
                                                      kapiHareketliMi = true;
                                                  }
                                              }).
                                              withEndAction(new Runnable() {
                                                  @Override
                                                  public void run() {
                                                      kapiHareketliMi = false;
                                                  }
                                              }).setDuration(500);
                                  }
                              }
                );
    }

    public void cagir1(View view) {
        if (kabinHareketliMi || kapiHareketliMi) return; //zaten hareket var, programı kes
        if (hangiKat == 3)
            kabinHareketEt(2, 1);    //2 kat aşağı
        if (hangiKat == 2)
            kabinHareketEt(1, 1);    //1 kat aşağı
        if (hangiKat == 1)
            kapiAcKapa();                             //sadece kapıyı aç
        hangiKat = 1;   //güncel kat
    }


    public void cagir2(View view) {
        if (kabinHareketliMi || kapiHareketliMi) return; //zaten hareket var, programı kes
        if (hangiKat == 3)
            kabinHareketEt(1, 1);    //1 kat yukarı
        if (hangiKat == 2)
            kapiAcKapa();                             //sadece kapıyı aç
        if (hangiKat == 1)
            kabinHareketEt(1, -1);   //1 kat aşağı
        hangiKat = 2;  //güncel kat
    }

    public void cagir3(View view) {
        if (kabinHareketliMi || kapiHareketliMi) return; //zaten hareket var, programı kes
        if (hangiKat == 3)
            kapiAcKapa();                             //sadece kapıyı aç
        if (hangiKat == 2)
            kabinHareketEt(1, -1);   //1 kat yukarı
        if (hangiKat == 1)
            kabinHareketEt(2, -1);   //2 kat yukarı
        hangiKat = 3;  //güncel kat
    }
}
