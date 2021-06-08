package com.example.academicregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {
    public EditText etUSerName, etPasswordLg;
    public Button btnLg;
    public TextView goRegister, goAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnLg = (Button)findViewById(R.id.btnLg);
        etUSerName = (EditText)findViewById(R.id.etUSerName);
        etPasswordLg = (EditText) findViewById(R.id.etPasswordLg);
        goRegister = (TextView)findViewById(R.id.goRegister);
        goAdmin = (TextView)findViewById(R.id.goAdmin);

        goRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interMain = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(interMain);
            }
        });

        goAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent interAd = new Intent(SecondActivity.this, LoginActivity.class);
//                startActivity(interAd);
            }
        });
    }

    public void OnLogin(View view) {
        String UserName = etUSerName.getText().toString();
        String password = etPasswordLg.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, UserName, password);
    }
}