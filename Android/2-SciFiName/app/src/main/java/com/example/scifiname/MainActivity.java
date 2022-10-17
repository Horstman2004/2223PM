package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //First thing: Create global varibles for widget
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

        generateBTN.setOnClickListener(new View.OnClickListener() )
            @Override
            public void onClick(View view){
                generate();
        }



    }
}