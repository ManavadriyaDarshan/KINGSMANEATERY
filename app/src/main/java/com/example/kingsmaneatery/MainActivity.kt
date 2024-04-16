package com.example.kingsmaneatery

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dial = findViewById<Button>(R.id.dial);   // For click here to order button
        dial.setOnClickListener({
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+91 9924247304"));
            startActivity(intent);
        })

        val top = findViewById<Button>(R.id.top);  // For top selling items button
        top.setOnClickListener({
            val intent = Intent(this,MainActivity2::class.java);
            startActivity(intent);
        })

        val loc = findViewById<Button>(R.id.loc);  // For Location button
        loc.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=22.599024,72.823322&mode=l"));
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        })

        val cate = findViewById<Button>(R.id.cate); // For categories button
        cate.setOnClickListener({
            val intent = Intent(this,MainActivity3::class.java);
            startActivity(intent);
        })

    }
}