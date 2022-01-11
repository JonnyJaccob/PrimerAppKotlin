package com.example.kotttimerutine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.kotttimerutine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrueba.setOnClickListener()
        {
            Handler(Looper.getMainLooper()).postDelayed(
                {

                    startActivity(
                        Intent(this@MainActivity,
                            PruebaActivity::class.java)
                    )
                    finish()
                }, 3000
            )
        }

    }
}