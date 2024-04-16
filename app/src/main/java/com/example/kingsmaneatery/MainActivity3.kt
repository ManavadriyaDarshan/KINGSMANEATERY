package com.example.kingsmaneatery

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val combo = findViewById<CardView>(R.id.combo);
        combo.setOnClickListener({
            val intent = Intent(this,MainActivity4::class.java);
            startActivity(intent);
        })

        val pizza = findViewById<CardView>(R.id.pizza);
        pizza.setOnClickListener({
            val intent = Intent(this,MainActivity5::class.java);
            startActivity(intent);
        })

        val burger = findViewById<CardView>(R.id.burger);
        burger.setOnClickListener({
            val intent = Intent(this,MainActivity6::class.java);
            startActivity(intent);
        })

        val sandwich = findViewById<CardView>(R.id.sandwich);
        sandwich.setOnClickListener({
            val intent = Intent(this,MainActivity7::class.java);
            startActivity(intent);
        })

        val garlic = findViewById<CardView>(R.id.garlic);
        garlic.setOnClickListener({
            val intent = Intent(this,MainActivity8::class.java);
            startActivity(intent);
        })

        val maggi = findViewById<CardView>(R.id.maggi);
        maggi.setOnClickListener({
            val intent = Intent(this,MainActivity9::class.java);
            startActivity(intent);
        })

        val frankie = findViewById<CardView>(R.id.frankie);
        frankie.setOnClickListener({
            val intent = Intent(this,MainActivity10::class.java);
            startActivity(intent);
        })

        val tacos = findViewById<CardView>(R.id.tacos);
        tacos.setOnClickListener({
            val intent = Intent(this,MainActivity11::class.java);
            startActivity(intent);
        })

        val fries = findViewById<CardView>(R.id.fries);
        fries.setOnClickListener({
            val intent = Intent(this,MainActivity12::class.java);
            startActivity(intent);
        })

        val tornados = findViewById<CardView>(R.id.tornados);
        tornados.setOnClickListener({
            val intent = Intent(this,MainActivity13::class.java);
            startActivity(intent);
        })

    }
}