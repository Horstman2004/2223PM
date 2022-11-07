package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    private RadioGroup sizeRG;
    private RadioButton smallBTN;
    private RadioButton mediumBTN;
    private RadioButton largeBTN;
    private TextView outputLBL, welcomeLBL, toppingsLBL, sizeLBL;
    private CheckBox anchoviesCBOX, baconCBOX, jalapenosCBOX;
    private Button completeBTN;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sizeRG = findViewById(R.id.sizeRG);
        smallBTN = findViewById(R.id.smallBTN);
        mediumBTN = findViewById(R.id.mediumBTN);
        largeBTN = findViewById(R.id.largeBTN);

        outputLBL = findViewById(R.id.outputLBL);

        anchoviesCBOX = findViewById(R.id.anchoviesCBOX);
        baconCBOX = findViewById(R.id.baconCBOX);
        jalapenosCBOX = findViewById(R.id.jalapenosCBOX);

        completeBTN = findViewById(R.id.completeBTN);

        completeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=0;
                if (anchoviesCBOX.isChecked()) {
                    total += 100;
                    //Toast.makeText(Which Activity your toasting in, message, length).show();
                    Toast.makeText(MainActivity.this, "Anchovies", Toast.LENGTH_SHORT).show();
                }
                if (baconCBOX.isChecked()) {
                    total += 2.50;
                }
                if (jalapenosCBOX.isChecked()) {
                    total += 2.50;
                }
                onRadioButtonClicked();
                outputLBL.setText(Double.toString(total));
            }
        });

        //if you change your choice, it will do something
        sizeRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton rb = (RadioButton) sizeRG.findViewById(id);
            }
        });
    }

    private void onRadioButtonClicked(){
        //highly recommend doing this for any widgets that use a function
        //Log will send a message to your logcat
        Log.d("Radio Button Clicked", "triggered");

        //if no radiobutton is set don't do anything
        int selectedID = sizeRG.getCheckedRadioButtonId();
        if(selectedID==-1){
            Toast.makeText(MainActivity.this, "Choose a size", Toast.LENGTH_SHORT).show();
        }
        else{
            //if there is a radio button selected, set the object to that button
            RadioButton radioButton = (RadioButton) sizeRG.findViewById(selectedID);

            //if small is selected total-5
            if(radioButton.getText().equals("Small")){
                total+=5;
            }

            //medium is 6 bucks
            else if(radioButton.getText().equals("Medium")){
                total+=6;
            }

            //large is 7 bucks
            else{
                total+=7;
            }
        }
    }

}