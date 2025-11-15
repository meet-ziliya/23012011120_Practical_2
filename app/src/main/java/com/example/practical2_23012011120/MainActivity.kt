package com.example.practical2_23012011120

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.google.android.material.snackbar.Snackbar
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("ActivityLifeCycle", "onCreate() called")
        Toast.makeText(this, "onCreate() called", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(android.R.id.content),"OnCreate()",Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifeCycle", "onStart() called")
        Toast.makeText(this, "onStart() called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifeCycle", "onResume() called")
        Toast.makeText(this, "onResume() called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifeCycle", "onPause() called")
        Toast.makeText(this, "onPause() called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifeCycle", "onStop() called")
        Toast.makeText(this, "onStop() called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifeCycle", "onRestart() called")
        Toast.makeText(this, "onRestart() called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifeCycle", "onDestroy() called")
        Toast.makeText(this, "onDestroy() called", Toast.LENGTH_SHORT).show()
    }
}