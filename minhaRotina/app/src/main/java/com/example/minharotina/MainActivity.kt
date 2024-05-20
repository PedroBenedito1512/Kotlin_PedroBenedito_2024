package com.example.minharotina
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title = findViewById<TextView>(R.id.title)
        val subtitle = findViewById<TextView>(R.id.subtitle)
        val morningTitle = findViewById<TextView>(R.id.morningTitle)
        val morningText = findViewById<TextView>(R.id.morningText)
        val afternoonTitle = findViewById<TextView>(R.id.afternoonTitle)
        val afternoonText = findViewById<TextView>(R.id.afternoonText)
        val eveningTitle = findViewById<TextView>(R.id.eveningTitle)
        val eveningText = findViewById<TextView>(R.id.eveningText)
        val quoteTitle = findViewById<TextView>(R.id.quoteTitle)
        val quoteText = findViewById<TextView>(R.id.quoteText)
        val imgkururu = findViewById<ImageView>(R.id.imgkururu)
    }
}
