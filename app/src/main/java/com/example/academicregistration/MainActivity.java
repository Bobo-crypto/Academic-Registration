package com.example.academicregistration;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button btnSignin;
    public EditText etFname, etPassword, etEmail, etdob, etNumber;
    public  TextView gologin;
    public EditText User_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFname = (EditText)findViewById(R.id.etFname);
        User_name = (EditText) findViewById(R.id.rUSerName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etdob = (EditText)findViewById(R.id.edtDOB);
        etNumber = (EditText)findViewById(R.id.etNumber);

        btnSignin = (Button) findViewById(R.id.btnSingin);
        gologin = (TextView)findViewById(R.id.goLogin);


        gologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Input your Login Credentials", Toast.LENGTH_LONG).show();
                Intent intergoR = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intergoR);
            }
        });

    }

    public void onSignin(View view) {
        String FName = etFname.getText().toString();
        String UserName = User_name.getText().toString();
        String password = etPassword.getText().toString();
        String email = etEmail.getText().toString();
        String number = etNumber.getText().toString();
        String Dob = etdob.getText().toString();

        String type = "signin";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, FName, UserName, password, email, number, Dob);
        Toast.makeText(MainActivity.this, "Congrats, Registration into HTTTC Bambibi Successful!!!", Toast.LENGTH_SHORT).show();
        Intent inter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(inter);
    }
}