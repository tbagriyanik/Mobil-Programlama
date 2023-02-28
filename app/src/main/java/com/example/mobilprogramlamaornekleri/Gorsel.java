package com.example.mobilprogramlamaornekleri;

public class Gorsel {
    String bilgi;
    int siraNo;
    int foto;
    //property
    //public tüm uygulamada
    //private sadece sınıf içinde

    //metodlar
    //hem sınıf adı Gorsel ve method da Gorsel ise Constructer
    public Gorsel(String bilgi, int siraNo, int foto) {
        this.bilgi = bilgi;
        this.siraNo = siraNo;
        this.foto = foto;
    }

    //public void olay
    public int toplam(int a, int b) {
        //Gorsel.ornek()
        return a + b;
    }

    public int toplam(int a, int b, int c) {
        //çokbiçimlilik
        return a + b + c;
    }
}