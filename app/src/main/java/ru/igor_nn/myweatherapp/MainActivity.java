package ru.igor_nn.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final boolean LOG = true;
    private static final String TAG = "myweatherapp_main_page";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(LOG) {
            Log.i(TAG, "activity_main is created");
        }

        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Осн.Активити. Первый запуск!";
        }
        else{
            instanceState = "Осн.Активити. Повторный запуск!";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, instanceState + " - onCreate()");
        }

        Button button1 = findViewById(R.id.changeRegion);
        button1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ChangeRegionActivity.class));

            if(LOG) {
                Log.i(TAG, "Нажата кнопка \"Выбор города\"");
            }

        });

        Button button2 = findViewById(R.id.menuConfig);
        button2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SetupMenuActivity.class));

            if(LOG) {
                Log.i(TAG, "Нажата кнопка \"Меню Настроек\"");
            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onStart()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onStart()");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "Осн.Активити. Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити. Повторный запуск!! - onRestoreInstanceState()");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onResume()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onResume()");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onPause()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onPause()");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "Осн.Активити - onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onSaveInstanceState()");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onStop()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onStop()");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onRestart()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onRestart()");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Осн.Активити - onDestroy()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onDestroy()");
        }
    }

}