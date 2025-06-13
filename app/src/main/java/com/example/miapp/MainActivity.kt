package com.example.miapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color
import android.graphics.Typeface

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "¡FUNCIONÓ!\n\nAPK generada con IA y GitHub Actions\n\n✅ Build exitoso"
            textSize = 18f
            gravity = Gravity.CENTER
            setTextColor(Color.parseColor("#2E7D32"))
            typeface = Typeface.DEFAULT_BOLD
            setPadding(32, 32, 32, 32)
        }
        
        setContentView(textView)
    }
}
