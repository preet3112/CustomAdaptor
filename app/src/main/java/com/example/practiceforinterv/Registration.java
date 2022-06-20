package com.example.practiceforinterv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class Registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText email,password,phone,confirmPass,city;
    String[] countryNames={"India","China","Australia","Portugle","America","New Zealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        email=findViewById(R.id.email);
        password=findViewById(R.id.pass);
        phone=findViewById(R.id.mobileNumber);
        confirmPass=findViewById(R.id.confirmPass);
        Spinner spin = (Spinner) findViewById(R.id.spinn);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryNames);
        spin.setAdapter(customAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), countryNames[position], Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}