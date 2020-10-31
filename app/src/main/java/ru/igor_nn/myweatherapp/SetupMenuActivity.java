package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SetupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_menu);

        Button button4 = findViewById(R.id.buttonback2);
        button4.setOnClickListener(v -> {
            startActivity(new Intent(SetupMenuActivity.this, MainActivity.class));
        });
    }
}
