package ru.igor_nn.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ChangeRegionActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_region);

        Parcel parcel = (Parcel) getIntent().getExtras().getSerializable(TEXT); //получить данные из Intent
        EditText editTextChangeCity = findViewById(R.id.inputRegion);
        editTextChangeCity.setText(parcel.textCity); // Сохранить их в EditText

        Button button3 = findViewById(R.id.buttonback1);
        button3.setOnClickListener(v -> {
            EditText editText = (EditText) findViewById(R.id.inputRegion);
            CheckBox check1 = findViewById(R.id.checkBox1);   // checkBox "Скорость ветра"
            Intent intentResult = new Intent();
            intentResult.putExtra("TextCity", editText.getText().toString());
            intentResult.putExtra("TempActual", "-1");
            intentResult.putExtra("TempMin", "-4");
            intentResult.putExtra("TempMax", "3");
            intentResult.putExtra("TempReal", "-2");
            intentResult.putExtra("Text1", check1.getText());
            intentResult.putExtra("IsBool", check1.isChecked());
            setResult( RESULT_OK , intentResult);
            finish();
        });
    }
}
