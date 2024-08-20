package com.example.score;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCount1;
    private TextView textViewCount2;
    private int counter1;
    private int counter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCount1 = findViewById(R.id.textViewCount1);
        textViewCount2 = findViewById(R.id.textViewCount2);
        if (savedInstanceState!=null) {
            counter1 = savedInstanceState.getInt("count1");
            textViewCount1.setText(String.valueOf(counter1));
            counter2 = savedInstanceState.getInt("count2");
            textViewCount2.setText(String.valueOf(counter2));
        } else {
            counter1=0;
            counter2=0;
        }

        textViewCount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1++;
                textViewCount1.setText(String.valueOf(counter1));
            }
        });
        textViewCount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2++;
                textViewCount2.setText(String.valueOf(counter2));
            }
        });
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count1", counter1);
        outState.putInt("count2", counter2);
    }
}