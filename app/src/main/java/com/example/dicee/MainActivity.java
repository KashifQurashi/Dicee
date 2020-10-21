package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightdice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArry = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Diecc", "Ze Button has been pressed!");

                Random randomNmberGenerator = new Random();

                int number = randomNmberGenerator.nextInt(6);

                Log.d("Diecc","The random number is:" + number);

                leftDice.setImageResource(diceArry[number]);

                number = randomNmberGenerator.nextInt(6);
                rightdice.setImageResource(diceArry[number]);

            }
        });
    }
}