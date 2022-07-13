package com.aniketjain.birthdaygreet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aniketjain.birthdaygreet.Utils.NAME_EXTRA
import com.aniketjain.birthdaygreet.databinding.ActivityBirthdayGreetingBinding

class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayMessage: String =
            "Wish you a Very Happy Birthday $name \uD83C\uDF82\uD83C\uDF8A\uD83C\uDF89\uD83C\uDF89"

        binding.tvBirthdayWish.text = birthdayMessage

    }
}