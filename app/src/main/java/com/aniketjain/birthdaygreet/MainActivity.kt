package com.aniketjain.birthdaygreet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aniketjain.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        View Binding in Kt
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = binding.etInput.text.toString()

        binding.btnCreateCard.setOnClickListener {
            Toast.makeText(this, "My name is $name", Toast.LENGTH_LONG).show()
        }

    }
}