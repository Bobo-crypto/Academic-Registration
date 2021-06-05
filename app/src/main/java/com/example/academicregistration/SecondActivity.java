package com.example.academicregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public EditText etEmailLg, etPasswordLg;
    public Button btnLg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnLg = (Button)findViewById(R.id.btnLg);
        etEmailLg = (EditText)findViewById(R.id.etEmailLg);
        etPasswordLg = (EditText) findViewById(R.id.etPasswordLg);
    }
}