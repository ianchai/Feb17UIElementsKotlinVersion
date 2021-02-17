package com.example.uielements

import android.os.Bundle
import android.os.SystemClock
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var cGodFather: CheckBox
    private lateinit var cPulp: CheckBox
    private lateinit var cMatrix: CheckBox
    private lateinit var radioGroup: RadioGroup
    private lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cGodFather = findViewById(R.id.godfather)
        cPulp = findViewById(R.id.pulp)
        cMatrix = findViewById(R.id.matrix)
        radioGroup = findViewById(R.id.radgrp)
        progressBar = findViewById(R.id.progressBar)
        cGodFather.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b -> if (cGodFather.isChecked()) Toast.makeText(this@MainActivity, "You have selected The Godfather", Toast.LENGTH_SHORT).show() else Toast.makeText(this@MainActivity, "You have NOT selected The Godfather", Toast.LENGTH_SHORT).show() })
        cPulp.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b -> if (cPulp.isChecked()) Toast.makeText(this@MainActivity, "You have selected Pulp Fiction", Toast.LENGTH_SHORT).show() else Toast.makeText(this@MainActivity, "You have NOT selected Pulp Fiction", Toast.LENGTH_SHORT).show() })
        cMatrix.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b -> if (cMatrix.isChecked()) Toast.makeText(this@MainActivity, "You have selected The Matrix", Toast.LENGTH_SHORT).show() else Toast.makeText(this@MainActivity, "You have NOT selected The Matrix", Toast.LENGTH_SHORT).show() })
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.red -> Toast.makeText(this@MainActivity, "Red selected", Toast.LENGTH_SHORT).show()
                R.id.green -> Toast.makeText(this@MainActivity, "Green selected", Toast.LENGTH_SHORT).show()
                R.id.orange -> Toast.makeText(this@MainActivity, "Orange selected", Toast.LENGTH_SHORT).show()
            }
        })
        val thread = Thread {
            for (i in 0..9) {
                progressBar.incrementProgressBy(10)
                SystemClock.sleep(2000)
            }
        }
        thread.start()
    }
}