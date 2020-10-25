package ru.igor_nn.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView currentCity = findViewById(R.id.city);
        String currCity = getResources().getString(R.string.city);
//        currCity += "!!";
        currentCity.setText(currCity);

        TextView currentTemp = findViewById(R.id.unitsTemp);
        String currTemp = "10" + " " + getResources().getString(R.string.unitsTemp);    //планирую получать текущую температуру
//        currTemp = "10 " + currTemp;
        currentTemp.setText(currTemp);

        TextView minTemperature = findViewById(R.id.minTemp);
        String minTemp = getResources().getString(R.string.minTemp) + " " + "-1" + " " + getResources().getString(R.string.unitsTemp);  //планирую получать температуру ночью
        minTemperature.setText(minTemp);

        TextView maxTemperature = findViewById(R.id.maxTemp);
        String maxTemp = getResources().getString(R.string.maxTemp) + " " + "14" + " " + getResources().getString(R.string.unitsTemp);  //планирую получать температуру днём
        maxTemperature.setText(maxTemp);

        TextView realFeelTemperature = findViewById(R.id.realFeelTemp);
        String realFeelTemp = getResources().getString(R.string.realFeelTemp) + " " + "11" + " " + getResources().getString(R.string.unitsTemp);    //планирую получать ощущаемую температуру
        realFeelTemperature.setText(realFeelTemp);

    }
}