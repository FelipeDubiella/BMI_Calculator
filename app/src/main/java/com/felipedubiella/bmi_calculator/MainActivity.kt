package com.felipedubiella.bmi_calculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtHeight = findViewById<TextInputEditText>(R.id.edtHeight)
        val edtWeight = findViewById<TextInputEditText>(R.id.edtWeight)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener {

            val heightStr: String = edtHeight.text.toString()
            val weightStr: String = edtWeight.text.toString()

            if (heightStr == "" || weightStr == ""){
                //Mostrar mensagem para usuario
                Snackbar
                    .make(
                        edtWeight,
                        "Fill all the fields",
                        Snackbar.LENGTH_LONG)
                    .show()


            }else{

                val height = heightStr.toFloat()
                val weight = weightStr.toFloat()


                val heightQ2 = height * height
                val result = weight / heightQ2

                println(result)



            }

        }

    }
}