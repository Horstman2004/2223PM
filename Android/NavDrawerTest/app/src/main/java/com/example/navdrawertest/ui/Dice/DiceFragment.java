package com.example.navdrawertest.ui.Dice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navdrawertest.R;

import java.util.Random;

public class DiceFragment extends Fragment {

    private ImageView dice;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_dice, container, false);

        //connect the widgets
        dice = rootView.findViewById(R.id.diceIMG);

        //setOnClick
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

        return rootView;
    }

    private void rollDice(){
        //generate a random#
        Random rng = new Random();
        int randomNumber = rng.nextInt(6);
        //set the image to that dice
        //switch based on the varible
        switch(randomNumber){
            case 0:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 1:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice6);
                break;
        }
    }


}
