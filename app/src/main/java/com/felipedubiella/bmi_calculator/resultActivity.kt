package com.felipedubiella.bmi_calculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "resultActivity.KEY_IMC"

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvClassification = findViewById<TextView>(R.id.tvClassification)

        tvResult.text = result.toString()

        val classification: String = if(result <= 18.5f){
            "UNDERWEIGHT"
        } else if(result > 18.5f && result <= 24.9f){
            "NORMAL"
        }else if (result >= 25.0f && result <=29.9){
            "OVERWEIGHT"
        }else if ( result >= 30f && result <= 39.9f){
            "OBESE CLASS 1"
        }else{
            "OBESE CLASS 2"
        }
        tvClassification.text = classification
    }
}