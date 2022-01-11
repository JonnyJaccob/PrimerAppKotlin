package com.example.kotttimerutine

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.example.kotttimerutine.databinding.ActivityMainBinding
import com.example.kotttimerutine.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash) //quitar por el nuevo v
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val splashAnimation = AnimationUtils.loadAnimation(this, R.anim.asset_splash_in)//Es la animacion creada

        binding.ivSplashLogo.startAnimation(splashAnimation)
        binding.tvSplashTitle.startAnimation(splashAnimation)

        @Suppress("DEPRECATION")
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        Handler(Looper.getMainLooper()).postDelayed(
            {
                //Launch the activity main
                startActivity(
                    Intent(this@SplashActivity,
                        MainActivity::class.java)
                )
                finish()
            }, 3000
        )
    }
}