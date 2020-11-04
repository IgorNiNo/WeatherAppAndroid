package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeRegionActivity extends AppCompatActivity {
    private CheckBox check1;   // checkBox "Скорость ветра"
    private CheckBox check2;   // checkBox "Атмосферное давление"
    final PresenterWindSpeed windSpeed = PresenterWindSpeed.getInstance();  // Получить презентер "Скорость ветра"
    final PresenterAtmoPress atmoPress = PresenterAtmoPress.getInstance();  // Получить презентер "Атмосферное давление"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_region);

        check1 = findViewById(R.id.checkBox1);   // checkBox "Скорость ветра"
        check2 = findViewById(R.id.checkBox2);   // checkBox "Атмосферное давление"
        check1.setChecked(windSpeed.isWindSpeed());
        check2.setChecked(atmoPress.isAtmoPress());

        Button button3 = findViewById(R.id.buttonback1);
        button3.setOnClickListener(v -> {
            startActivity(new Intent(ChangeRegionActivity.this, MainActivity.class));
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        windSpeed.setWindSpeed(check1.isChecked());
        atmoPress.setAtmoPress(check2.isChecked());
    }
}
