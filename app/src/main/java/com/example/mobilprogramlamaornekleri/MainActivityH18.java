package com.example.mobilprogramlamaornekleri;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityH18 extends AppCompatActivity {
    WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h18);

        //https://umiitkose.com/2015/08/android-studio-webview/
        webV = findViewById(R.id.webView);
        webV.getSettings().setJavaScriptEnabled(true);
        webV.setWebViewClient(new WebViewClient());
        webV.setWebChromeClient(new WebChromeClient());
        webV.loadUrl("https://tuzlaatl.meb.k12.tr/");

    }

    public void goster(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Programdan çıkmak ister misiniz?")
                .setMessage("Uygulama kapanacaktır.")
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                    }
                })
                .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Vazgeçtiniz",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }
}