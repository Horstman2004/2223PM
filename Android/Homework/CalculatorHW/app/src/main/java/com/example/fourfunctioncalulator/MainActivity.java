package com.example.fourfunctioncalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //set globals
    private Button addBTN, subBTN, multiBTN, divideBTN, equalsBTN, oneBTN, twoBTN, threeBTN, fourBTN, fiveBTN, sixBTN, sevenBTN, eightBTN, nineBTN, zeroBTN;
    private TextView outputTXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java objects to widgets
        outputTXT = findViewById(R.id.outputTXT);
        equalsBTN = findViewById(R.id.equalsBTN);
        addBTN = findViewById(R.id.addBTN);
        subBTN = findViewById(R.id.subBTN);
        multiBTN = findViewById(R.id.multiBTN);
        divideBTN = findViewById(R.id.divideBTN);
        zeroBTN = findViewById(R.id.zeroBTN);
        oneBTN = findViewById(R.id.oneBTN);
        twoBTN = findViewById(R.id.twoBTN);
        threeBTN = findViewById(R.id.threeBTN);
        fourBTN = findViewById(R.id.fourBTN);
        fiveBTN = findViewById(R.id.fiveBTN);
        sixBTN = findViewById(R.id.sixBTN);
        sevenBTN = findViewById(R.id.sevenBTN);
        eightBTN = findViewById(R.id.eightBTN);
        nineBTN = findViewById(R.id.nineBTN);

        ArrayList<String> Listy = new ArrayList<String>();

        //calculation
        equalsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num;
                if (equalsBTN.isPressed()) {
                    String expressions = (String) outputTXT.getText();
                    for (int i = 0; i <= expressions.length(); i++) {
                        String currentExp = String.valueOf(expressions.indexOf(i));
                        if (currentExp == "1" || currentExp == "2" || currentExp == "3" || currentExp == "4") {

                        }
                    }
                }
            }
        });

        //setOnClickListeners
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(addBTN.isPressed()){
                    //outputTXT.append("+");
                    outputTXT.append("+");

                }
            }
        });

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(subBTN.isPressed()){
                    outputTXT.append("-");
                }
            }
        });

        multiBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(multiBTN.isPressed()){
                    outputTXT.append("X");
                }
            }
        });

        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(divideBTN.isPressed()){
                    outputTXT.append("/");
                }
            }
        });

        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zeroBTN.isPressed()){
                    outputTXT.append("0");
                }
            }
        });

        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nineBTN.isPressed()){
                    outputTXT.append("9");
                }
            }
        });

        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eightBTN.isPressed()){
                    outputTXT.append("8");
                }
            }
        });

        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sevenBTN.isPressed()){
                    outputTXT.append("7");
                }
            }
        });

        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sixBTN.isPressed()){
                    outputTXT.append("6");
                }
            }
        });

        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fiveBTN.isPressed()){
                    outputTXT.append("5");
                }
            }
        });

        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fourBTN.isPressed()){
                    outputTXT.append("4");
                }
            }
        });

        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(threeBTN.isPressed()){
                    outputTXT.append("3");
                }
            }
        });

        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(twoBTN.isPressed()){
                    outputTXT.append("2");
                }
            }
        });

        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(oneBTN.isPressed()){
                    outputTXT.append("1");
                }
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