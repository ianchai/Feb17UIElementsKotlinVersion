package com.example.uielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cGodFather, cPulp, cMatrix;
    private RadioGroup radioGroup;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cGodFather=findViewById(R.id.godfather);
        cPulp=findViewById(R.id.pulp);
        cMatrix=findViewById(R.id.matrix);

        radioGroup=findViewById(R.id.radgrp);

        progressBar=findViewById(R.id.progressBar);

        cGodFather.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cGodFather.isChecked())
                    Toast.makeText(MainActivity.this, "You have selected The Godfather",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You have NOT selected The Godfather",Toast.LENGTH_SHORT).show();
            }
        });

        cPulp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cPulp.isChecked())
                    Toast.makeText(MainActivity.this, "You have selected Pulp Fiction",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You have NOT selected Pulp Fiction",Toast.LENGTH_SHORT).show();
            }
        });

        cMatrix.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cMatrix.isChecked())
                    Toast.makeText(MainActivity.this, "You have selected The Matrix",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "You have NOT selected The Matrix",Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.red:
                        Toast.makeText(MainActivity.this,"Red selected", Toast.LENGTH_SHORT).show(); break;
                    case R.id.green:
                        Toast.makeText(MainActivity.this,"Green selected", Toast.LENGTH_SHORT).show(); break;
                    case R.id.orange:
                        Toast.makeText(MainActivity.this,"Orange selected", Toast.LENGTH_SHORT).show(); break;
                }
            }
        });

        Thread thread = new Thread(  new Runnable() {
            @Override
            public void run()
            {   for (int i=0; i<10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(2000);
                }
            }
        });
        thread.start();
    }
}