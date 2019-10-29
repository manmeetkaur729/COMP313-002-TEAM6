package com.example.isitraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // set toolbar title
        Toolbar tbSet = findViewById(R.id.tbSet);
        setSupportActionBar(tbSet);
        getSupportActionBar().setTitle("Setting");
    }
}