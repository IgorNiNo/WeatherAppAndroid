package ru.igor_nn.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.changeRegion);
        button1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ChangeRegionActivity.class));
        });

        Button button2 = findViewById(R.id.menuConfig);
        button2.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SetupMenuActivity.class));
        });
    }
}