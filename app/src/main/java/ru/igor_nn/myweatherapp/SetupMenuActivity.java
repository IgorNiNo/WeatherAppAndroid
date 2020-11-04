package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

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

        switch1 = findViewById(R.id.switch1);   // switch "Ночная тема"
        switch2 = findViewById(R.id.switch2);   // switch "Автоматическая локация"
        switch1.setChecked(nightTheme.isNightTheme());
        switch2.setChecked(autoLoc.isAutoLoc());

        Button button4 = findViewById(R.id.buttonback2);
        button4.setOnClickListener(v -> {
            startActivity(new Intent(SetupMenuActivity.this, MainActivity.class));
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState){
        super.onSaveInstanceState(saveInstanceState);
        nightTheme.setNightTheme(switch1.isChecked());
        autoLoc.setAutoLoc(switch2.isChecked());
    }
}
