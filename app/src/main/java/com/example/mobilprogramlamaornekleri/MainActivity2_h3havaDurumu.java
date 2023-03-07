package com.example.mobilprogramlamaornekleri;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity2_h3havaDurumu extends AppCompatActivity {
    TextView cloudTextView, tempTextView, mintempTextView, maxtempTextview,
            updatedTextView, sunriseTextView, sunsetTextView, windTextView, pressureTextView, humidityTextView;
    Spinner ilSec;
    String[] iller = {"ISTANBUL", "ANKARA", "IZMIR", "CANAKKALE", "NEVSEHIR", "IGDIR", "SINOP"};
    private String sehirAdi = "ISTANBUL";

    // https://collectapi.com/tr/ birçok ücretiz api
    // https://home.openweathermap.org/  hava durumu
    // https://ismetarslann.wordpress.com/2016/06/14/android-hava-durumujson/  eski Java örneği
    // https://github.com/RiteshPuvvada/WeatherApp/blob/main/app/src/main/java/com/example/weather/MainActivity.java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_h3hava_durumu);

        //etiket nesneleri
        updatedTextView = findViewById(R.id.textViewSonucMetni);
        cloudTextView = findViewById(R.id.textViewBulut);
        tempTextView = findViewById(R.id.sicakliktextView4);
        mintempTextView = findViewById(R.id.textView5);
        maxtempTextview = findViewById(R.id.textView6);
        sunriseTextView = findViewById(R.id.textViewGunesDS);
        sunsetTextView = findViewById(R.id.textViewGunesBS);
        windTextView = findViewById(R.id.textView8);
        pressureTextView = findViewById(R.id.textViewB8);
        humidityTextView = findViewById(R.id.textViewS8);

        //açılır kutu ve seçilmesi
        ilSec = findViewById(R.id.spinnerIller);
        ArrayAdapter<String> adapterIller = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, iller);
        adapterIller.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ilSec.setAdapter(adapterIller);
        ilSec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sehirAdi = iller[position];
                getWeather();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity2_h3havaDurumu.this, "İl seçimi yok", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getWeather() {
        DownloadTask task = new DownloadTask();
        task.execute("https://openweathermap.org/data/2.5/weather?q=" + sehirAdi + "&appid=439d4b804bc8187953eb36d2a8c26a02");
    }

    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            String result = "";
            URL url;
            HttpURLConnection connection = null;
            try {
                url = new URL(urls[0]);
                connection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                int data = inputStreamReader.read();
                while (data != -1) {
                    char current = (char) data;
                    result += current;
                    data = inputStreamReader.read();
                }
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONObject jsonObject = new JSONObject(s);
                JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
                JSONObject main = jsonObject.getJSONObject("main");
                JSONObject wind = jsonObject.getJSONObject("wind");
                JSONObject sys = jsonObject.getJSONObject("sys");

                Long updatedAt = jsonObject.getLong("dt");

                Calendar c = getCalendar(updatedAt);
                Date currentDatePlusOne = c.getTime();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                SimpleDateFormat saatFormat = new SimpleDateFormat("HH:mm");

                String updatedAtText = "Son Güncelleme: " + dateFormat.format(currentDatePlusOne);

                String temp = main.getString("temp") + "°C";
                String tempMin = "Min Sıcak: " + main.getString("temp_min") + "°C";
                String tempMax = "Mak Sıcak: " + main.getString("temp_max") + "°C";
                String pressure = main.getString("pressure");
                String humidity = main.getString("humidity");

                Long sunrise = sys.getLong("sunrise");
                c = getCalendar(sunrise);
                Date sunRiseYeni = c.getTime();

                Long sunset = sys.getLong("sunset");
                c = getCalendar(sunset);
                Date sunSetYeni = c.getTime();

                String windSpeed = wind.getString("speed");
                String weatherDescription = weather.getString("description");
                String address = jsonObject.getString("name") + ", " + sys.getString("country");

                updatedTextView.setText(updatedAtText);
                switch (weatherDescription) {
                    case "clear sky":
                        cloudTextView.setText("Bulut Yok");
                        break;
                    case "few clouds":
                        cloudTextView.setText("Az Bulutlu");
                        break;
                    case "scattered clouds":
                        cloudTextView.setText("Dağınık Bulutlu");
                        break;
                    case "broken clouds":
                        cloudTextView.setText("Parçalı Bulutlu");
                        break;
                    case "shower rain":
                        cloudTextView.setText("Çok Yağmurlu");
                        break;
                    case "rain":
                        cloudTextView.setText("Yağmurlu");
                        break;
                    case "thunderstorm":
                        cloudTextView.setText("Fırtına");
                        break;
                    case "snow":
                        cloudTextView.setText("Kar");
                        break;
                    case "mist":
                        cloudTextView.setText("Sisli");
                        break;
                    default:
                        cloudTextView.setText(""); //başka durumda boş
                        break;
                }

                tempTextView.setText(temp);
                mintempTextView.setText(tempMin);
                maxtempTextview.setText(tempMax);
                sunriseTextView.setText(saatFormat.format(sunRiseYeni));
                sunsetTextView.setText(saatFormat.format(sunSetYeni));
                windTextView.setText(windSpeed + " km/s");
                pressureTextView.setText(pressure + " hPa");
                humidityTextView.setText("% " + humidity);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @NonNull
    private Calendar getCalendar(Long updatedAt) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(updatedAt * 1000));
        c.add(Calendar.HOUR, 0); //zaman bölgesi için 3 saat eklenebilir, değişiklik yoksa 0
        return c;
    }
}