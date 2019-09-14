package com.example.nahom_pizza_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun orderbuttonClicker () {
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when{
            radioGroup.smallPizza.isChecked -> pizzaSizePrice = 5.0
            radioGroup.mediumpizza.isChecked -> pizzaSizePrice = 7.0
            radioGroup.Largepizza.isChecked-> pizzaSizePrice = 9.0
        }
        if(OnionsCheckBox.isChecked){toppingsTotal += 1}
        if(OliverCheckBox.isChecked){toppingsTotal += 2}
        if(TomatoesCheckBox.isChecked) {toppingsTotal +=  3}

        TotalPrice.text = "Total order price = $" + (pizzaSizePrice + toppingsTotal)
    }
}


