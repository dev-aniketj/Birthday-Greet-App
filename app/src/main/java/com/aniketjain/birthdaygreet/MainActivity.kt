package com.aniketjain.birthdaygreet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aniketjain.birthdaygreet.Utils.NAME_EXTRA
import com.aniketjain.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        View Binding in Kt
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnCreateCard.setOnClickListener {
            val name = binding.etInput.text.toString()
            val intent: Intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(NAME_EXTRA, name)
            startActivity(intent)
        }

    }
}