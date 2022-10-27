package com.example.intentexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private Button third;
    private TextView thirdLBL;
    private EditText thirdUI;

    @Override
    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //2. connect var with widgets
        third = findViewById(R.id.thirdBTN);
        thirdLBL = findViewById(R.id.thirdLBL);
        thirdUI = findViewById(R.id.thirdUI);

        //set key value for intent to remember
        String valueOfIntent = getIntent().getStringExtra("user input");
        thirdLBL.setText(valueOfIntent);

    }
}
