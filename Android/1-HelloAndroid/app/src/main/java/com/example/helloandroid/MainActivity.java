package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView outputLBL;
    static EditText inputTXT;
    Button buttonBTN;

    //the first method you want tobe ran -> on screen boot up, goes here
    @Override
    protected void onCreate(Bundle savedInstanceState) {    //equivalent to public static void main(String[] args){}
        super.onCreate(savedInstanceState);                 //Inheritance constructor to run the onCreate method
        setContentView(R.layout.activity_main);             //sets the java to look at the XML file

        //first thing is to connect Java objects to your widget
        outputLBL = findViewById(R.id.textView);
        inputTXT = findViewById(R.id.editText);
        buttonBTN = findViewById(R.id.Button);

        buttonBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });
    }
    //if wanting to hard code the onclick need View v in function parameter
    public static void hello(){
        //take in the user input -> get text from the widget
        String ui = String.valueOf(inputTXT.getText());
        //output "hello world"
        outputLBL.setText("Hello"+ui);
    }
}