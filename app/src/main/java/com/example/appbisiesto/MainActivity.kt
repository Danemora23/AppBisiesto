package com.example.appbisiesto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Verificar(view: View) {
        val año: Int = (IngreseAño.text.toString()).toInt()

        if(año % 4 == 0 && (año % 100 !=0 || año % 400 == 0)){
           Toast.makeText(this, "Año Bisiesto "+año,Toast.LENGTH_LONG  ).show()

        }else{
            Toast.makeText(this, "Año No Bisiesto "+año,Toast.LENGTH_LONG ).show()
        }

    }
}