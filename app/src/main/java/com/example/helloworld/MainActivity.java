package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private CheckBox checkBox;

    private  Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        checkBox = findViewById(R.id.checkbox);

        button1 = findViewById(R.id.button1);

        button.setOnClickListener(view -> {
            if (!checkBox.isChecked())
                checkBox.setChecked(true);
        });
        button1.setOnClickListener(view -> {
            if (checkBox.isChecked())
                checkBox.setChecked(false);
        });
        checkBox.seton
    }

    @Override
    public void onClick(View view) {

    }
}