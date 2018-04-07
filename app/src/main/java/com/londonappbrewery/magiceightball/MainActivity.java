package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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

        Button askButton = (Button)findViewById(R.id.AskButton);
        final ImageView eBall = (ImageView) findViewById((R.id.eBall));
        final int[] ballArr = { R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("8Ball","Button pressed");
                Random randomNumGen = new Random();
                int number = randomNumGen.nextInt(5);
                eBall.setImageResource(ballArr[number]);
            }
        });
    }




}
