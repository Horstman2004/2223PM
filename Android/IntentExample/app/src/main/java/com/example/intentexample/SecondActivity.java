package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    //1. global variables
    private Button second;
    private TextView secondLBL;
    private EditText secondUI;

    @Override
    public void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //2. connect var with widgets
        second = findViewById(R.id.secondBTN);
        secondLBL = findViewById(R.id.secondLBL);
        secondUI = findViewById(R.id.secondUI);

        //set key value for intent to remember
        String valueOfIntent = getIntent().getStringExtra("user input");
        secondLBL.setText(valueOfIntent);

        String ui = String.valueOf(secondUI.getText());
        Intent p = new Intent(SecondActivity.this,ThirdActivity.class);
        p.putExtra("user input",ui);

        startActivity(p);
    }

    /*
    * 1. Create java and XML files
    * 2. extends AppCompactActivity
    * 3. setup onCreate
    * 4. setContentView(R.layout.new_xml_file)
    * 5. add activity to the Manifest
    * */




}
