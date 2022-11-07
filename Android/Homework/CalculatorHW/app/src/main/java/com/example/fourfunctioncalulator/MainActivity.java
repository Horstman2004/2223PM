package com.example.fourfunctioncalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //set globals
    private EditText outputTXT;
    private Button addBTN, subBTN, multiBTN, divideBTN, equalsBTN, oneBTN, twoBTN, threeBTN, fourBTN, fiveBTN, sixBTN, sevenBTN, eightBTN, nineBTN, zeroBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java objects to widgets
        number1Input = findViewById(R.id.number1Input);
        number2Input = findViewById(R.id.number2Input);
        addBTN = findViewById(R.id.addBTN);
        subBTN = findViewById(R.id.subBTN);
        multiBTN = findViewById(R.id.multiBTN);
        divBTN = findViewById(R.id.divBTN);


        //setOnClickListeners
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1Input.getText()));

                int num2 = Integer.parseInt(String.valueOf(number2Input.getText()));
                int answer = num1 + num2;
                output.setText(String.valueOf(answer));
            }
        });

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1Input.getText()));

                int num2 = Integer.parseInt(String.valueOf(number2Input.getText()));
                int answer = num1 - num2;
                output.setText(String.valueOf(answer));
            }
        });

        multiBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1Input.getText()));

                int num2 = Integer.parseInt(String.valueOf(number2Input.getText()));
                int answer = num1 * num2;
                output.setText(String.valueOf(answer));
            }
        });

        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1Input.getText()));

                int num2 = Integer.parseInt(String.valueOf(number2Input.getText()));
                int answer = num1 / num2;
                output.setText(String.valueOf(answer));
            }
        });

    }

    //additional functions
//    private void calc(String operator, int n1, int n2){
//        if(operator.equals("+")){
//            return n1 + n2;
//        }
//    }
}