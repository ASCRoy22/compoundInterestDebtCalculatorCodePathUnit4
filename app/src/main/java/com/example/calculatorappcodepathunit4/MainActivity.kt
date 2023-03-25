package com.example.calculatorappcodepathunit4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        setupClickListeners()










    }





    private fun calculating() {
        var years: EditText=findViewById<EditText>(R.id.years)
        var rate:  EditText=findViewById<EditText>(R.id.rate)
        var principal: EditText=findViewById<EditText>(R.id.principal)
        var outcome: TextView=findViewById<TextView>(R.id.output)
        var calculated:Button=findViewById<Button>(R.id.calculate)
        var year:Int
        var rates:Double
        var principals:Double
        var outcomes:Double



try{
        rates=rate.getText().toString().toDouble()
        year=years.getText().toString().toInt()
        principals=principal.getText().toString().toDouble()
        outcomes=((1+rates))
        for(i in 1..year-1){
            outcomes=outcomes*(1+rates)

        }
        outcomes=(principals*outcomes)

        outcome.setText("Total amount due: $"+String.format("%.3f", outcomes).toDouble())}
catch(exception:NumberFormatException){

}








    }
    private fun setupClickListeners() {
        var calculated:Button=findViewById<Button>(R.id.calculate)
        calculated.setOnClickListener { calculating() }
         }

    }

