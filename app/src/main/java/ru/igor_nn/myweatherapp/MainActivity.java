package ru.igor_nn.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Constants {
    private final static int REQUEST_CODE = 1;
    private static final boolean LOG = true;
    private static final String TAG = "myweatherapp_main_page";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String instanceState;
        if (savedInstanceState == null){
            instanceState = "Осн.Активити. Первый запуск!";
        }
        else{
            instanceState = "Осн.Активити. Повторный запуск!";
        }
//        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, instanceState + " - onCreate()");
        }

        Button button1 = findViewById(R.id.changeRegion);
        button1.setOnClickListener(v -> {
            // Формируем посылку
            TextView textViewCity = findViewById(R.id.city);
            Parcel parcel = new Parcel();
            parcel.textCity = textViewCity.getText().toString();
            // Посылка сформирована, отправляем
            Intent intent = new Intent(MainActivity.this, ChangeRegionActivity.class);
            intent.putExtra(TEXT, parcel); // Отправляем посылку
            startActivityForResult(intent, REQUEST_CODE);
//            startActivity(new Intent(MainActivity.this, ChangeRegionActivity.class));
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
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_CODE) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == RESULT_OK){
            //название города
            TextView textCity = findViewById(R.id.city);
            textCity.setText(data.getStringExtra("TextCity"));
            //актуальная температура
            TextView temp = findViewById(R.id.currentTemp);
            String temperature = temp.getText().toString();
            temp.setText(String.format(temperature, data.getStringExtra("TempActual")));
            //минимальная температура
            temp = findViewById(R.id.minTemp);
            temperature = temp.getText().toString();
            temp.setText(String.format(temperature, data.getStringExtra("TempMin")));
            //максимальная температура
            temp = findViewById(R.id.maxTemp);
            temperature = temp.getText().toString();
            temp.setText(String.format(temperature, data.getStringExtra("TempMax")));
            //ощущаемая температура
            temp = findViewById(R.id.realFeelTemp);
            temperature = temp.getText().toString();
            temp.setText(String.format(temperature, data.getStringExtra("TempReal")));

//            //как работать с чек-боксами на основе Intent я не понял
//            TextView text2 = findViewById(R.id.textView2);
//            if(data.getBooleanExtra("IsBool", true)) {
//                text2.setText(data.getStringExtra("Text1"));
//            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onStart()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onStart()");
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Осн.Активити. Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити. Повторный запуск!! - onRestoreInstanceState()");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onResume()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onResume()");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onPause()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onPause()");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onSaveInstanceState()");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onStop()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onStop()");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onRestart()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onRestart()");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "Осн.Активити - onDestroy()", Toast.LENGTH_SHORT).show();
        if(LOG) {
            Log.d(TAG, "Осн.Активити - onDestroy()");
        }
    }

}