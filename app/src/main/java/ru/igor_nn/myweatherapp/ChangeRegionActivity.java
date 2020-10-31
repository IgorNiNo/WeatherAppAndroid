package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ChangeRegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_region);

        Button button3 = findViewById(R.id.buttonback1);
        button3.setOnClickListener(v -> {
            startActivity(new Intent(ChangeRegionActivity.this, MainActivity.class));
        });
    }
}
