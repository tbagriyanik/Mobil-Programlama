package com.example.mobilprogramlamaornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2_h1 extends AppCompatActivity {
    ListView liste;
    Spinner spin;
    String iller[] = {"İstanbul", "Ankara", "İzmir"};
    String ilce1[] = {"Pendik", "Kartal", "Tuzla"};
    String ilce2[] = {"Mamak", "Elmadağ", "Yenimahalle"};
    String ilce3[] = {"Konak", "Balçova", "Narlıdere"};
    String seciliListeden = "Hiçbirşey";
    String seciliAcilirListeden = "Hiçbirşey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_h1);

        ArrayAdapter<String> adapterilce1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ilce1);
        adapterilce1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> adapterilce2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ilce2);
        adapterilce2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> adapterilce3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ilce3);
        adapterilce3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin = (Spinner) findViewById(R.id.spinner1);
        spin.setAdapter(adapterilce1);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (seciliListeden.equals("İstanbul"))
                    seciliAcilirListeden = ilce1[position];
                else if (seciliListeden.equals("Ankara"))
                    seciliAcilirListeden = ilce2[position];
                else if (seciliListeden.equals("İzmir"))
                    seciliAcilirListeden = ilce3[position];
                else
                    seciliAcilirListeden = ilce1[position];

                Toast.makeText(MainActivity2_h1.this, "İlçe " + seciliAcilirListeden +
                        " seçildi.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity2_h1.this, "İlçe seçimi yok", Toast.LENGTH_SHORT).show();
            }
        });

        liste = (ListView) findViewById(R.id.liste);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, android.R.id.text1, iller);

        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long l) {
                AlertDialog.Builder dialog =
                        new AlertDialog.Builder(MainActivity2_h1.this);
                dialog.setMessage(iller[position]);
                dialog.setCancelable(false);
                dialog.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity2_h1.this,
                                iller[position].toString() + " iline gezi " +
                                        "amaçlı gidilebilir", Toast.LENGTH_SHORT).show();
                        seciliListeden = iller[position].toString();

                        if (seciliListeden.equals("İstanbul"))
                            spin.setAdapter(adapterilce1);
                        else if (seciliListeden.equals("Ankara"))
                            spin.setAdapter(adapterilce2);
                        else if (seciliListeden.equals("İzmir"))
                            spin.setAdapter(adapterilce3);
                    }
                });
                dialog.setNegativeButton("Hayır",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity2_h1.this,
                                        iller[position].toString() + " iline gezi " +
                                                "amaçlı gidilemez", Toast.LENGTH_SHORT).show();
                                seciliListeden = iller[position].toString();

                                if (seciliListeden.equals("İstanbul"))
                                    spin.setAdapter(adapterilce1);
                                else if (seciliListeden.equals("Ankara"))
                                    spin.setAdapter(adapterilce2);
                                else if (seciliListeden.equals("İzmir"))
                                    spin.setAdapter(adapterilce3);
                            }
                        });
                dialog.show();
            }
        });
    }

    public void tikla(View V) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2_h1.this);
        builder.setTitle("Dikkat");
        builder.setMessage("Pencere kapatılsın mı?");
        builder.setIcon(R.drawable.humidity);
        builder.setNegativeButton("Hayır, seçimi göster", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2_h1.this, "İl " +seciliListeden + " seçildi.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("Evet, kapat", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNeutralButton("İptal, işlem yok", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}