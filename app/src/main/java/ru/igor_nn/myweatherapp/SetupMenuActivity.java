package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SetupMenuActivity extends AppCompatActivity {
    private Switch switch1;   // switch "Ночная тема"
    private Switch switch2;   // switch "Автоматическая локация"
    final PresenterNightTheme nightTheme = PresenterNightTheme.getInstance();  // Получить презентер "Ночная тема"
    final PresenterAutoLoc autoLoc = PresenterAutoLoc.getInstance();  // Получить презентер "Автоматическая локация"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_menu);

//        String instanceState;
//        if (savedInstanceState == null){
//            instanceState = "Активити_Меню_Настроек. Первый запуск!";
//        }
//        else{
//            instanceState = "Активити_Меню_Настроек. Повторный запуск!";
//        }
//        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();

        switch1 = findViewById(R.id.switch1);   // switch "Ночная тема"
        switch2 = findViewById(R.id.switch2);   // switch "Автоматическая локация"
        switch1.setChecked(nightTheme.isNightTheme());
        switch2.setChecked(autoLoc.isAutoLoc());

        Button button4 = findViewById(R.id.buttonback2);
        button4.setOnClickListener(v -> {
            startActivity(new Intent(SetupMenuActivity.this, MainActivity.class));
        });
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onStart()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle saveInstanceState){
//        super.onRestoreInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек. Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onResume()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onPause()", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        nightTheme.setNightTheme(switch1.isChecked());
        autoLoc.setAutoLoc(switch2.isChecked());
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onStop()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onRestart()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "Активити_Меню_Настроек - onDestroy()", Toast.LENGTH_SHORT).show();
//    }

}
