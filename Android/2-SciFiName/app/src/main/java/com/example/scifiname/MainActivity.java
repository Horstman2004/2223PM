package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //First thing: Create global variables for widget
    EditText firstNameTXT, lastNameTXT, cityTXT, schoolTXT, broTXT ,sisTXT;
    Button generateBTN;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNameTXT = findViewById(R.id.firstInput);
        lastNameTXT = findViewById(R.id.lastInput);
        cityTXT = findViewById(R.id.cityInput);
        schoolTXT = findViewById(R.id.schoolInput);
        broTXT = findViewById(R.id.broInput);
        sisTXT = findViewById(R.id.sisInput);
        generateBTN = findViewById(R.id.generateBTN);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {generate();}
        });
    }
        public void generate() {
            String first = String.valueOf(firstNameTXT.getText());
            String last = String.valueOf(lastNameTXT.getText());
            String city = String.valueOf(cityTXT.getText());
            String school = String.valueOf(schoolTXT.getText());
            String bro = String.valueOf(broTXT.getText());
            String sis = String.valueOf(sisTXT.getText());

            //generate the bounds for each of the random portions
            Random randy = new Random();
            int rF = randy.nextInt(first.length());
            int rL = randy.nextInt(last.length());
            int rC = randy.nextInt(school.length());
            int rS = randy.nextInt(city.length());
            int rB = randy.nextInt(bro.length());
            int rSI = randy.nextInt(sis.length());


            String sciFiFirst = first.substring(0, rF) + last.substring(rL);
            String sciFiLast = city.substring(0, rC) + school.substring(rS);
            String sciFiHome = bro.substring(0, rB) + sis.substring(rSI);

            output.setText(String.format("Welcome! %s %s from %s", sciFiFirst, sciFiLast, sciFiHome));
        }

    }