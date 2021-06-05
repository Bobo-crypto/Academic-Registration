package com.example.academicregistration;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnSignin;
    public TextView etFname, etLname, etPassword, etEmail, etAreaCode, etNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFname = (TextView)findViewById(R.id.etFname);
        etLname = (TextView)findViewById(R.id.etLname);
        etPassword = (TextView)findViewById(R.id.etPassword);
        etEmail = (TextView)findViewById(R.id.etEmail);
        etAreaCode = (TextView)findViewById(R.id.edtAreaCode);
        etNumber = (TextView)findViewById(R.id.etNumber);
        btnSignin = (Button) findViewById(R.id.btnSingin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                Intent inter = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(inter);
            }
        });
    }
}