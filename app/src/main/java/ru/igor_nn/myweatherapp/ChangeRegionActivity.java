package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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

//        String instanceState;
//        if (savedInstanceState == null){
//            instanceState = "Активити_Выбор_Города. Первый запуск!";
//        }
//        else{
//            instanceState = "Активити_Выбор_Города. Повторный запуск!";
//        }
//        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();

        check1 = findViewById(R.id.checkBox1);   // checkBox "Скорость ветра"
        check2 = findViewById(R.id.checkBox2);   // checkBox "Атмосферное давление"
        check1.setChecked(windSpeed.isWindSpeed());
        check2.setChecked(atmoPress.isAtmoPress());

        Button button3 = findViewById(R.id.buttonback1);
        button3.setOnClickListener(v -> {
            startActivity(new Intent(ChangeRegionActivity.this, MainActivity.class));
        });
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onStart()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle saveInstanceState){
//        super.onRestoreInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города. Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onResume()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onPause()", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        windSpeed.setWindSpeed(check1.isChecked());
        atmoPress.setAtmoPress(check2.isChecked());
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onStop()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onRestart()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "Активити_Выбор_Города - onDestroy()", Toast.LENGTH_SHORT).show();
//    }

}
