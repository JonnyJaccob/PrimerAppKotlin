package com.example.kotttimerutine

import android.content.Context
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.core.content.ContextCompat.getSystemService
import com.example.kotttimerutine.databinding.ActivityPruebaBinding

class PruebaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPruebaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPruebaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var audio: Int = AudioManager.STREAM_MUSIC
        //val audioManager:AudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE)
        /*val audioManager:AudioManager = Context.getSystemService<AudioManager>(
            AudioManager::class.java
        )*/   //Asi se pasa a codigo de java a kotlin
        var audioManager: AudioManager? = null//solucion temporal
        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager?//quizas sirva
        //obtiene el volumen maximo
        //val volMax = getSystemService(AudioManager.AUDIO_SERVICE)
        //val volMax = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        var maxVolumen = audioManager!!.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        //obtiene el volumen actual
        //val volumen = AudioManager.getStreamVolume
        var curVolumen = audioManager!!.getStreamVolume(AudioManager.STREAM_MUSIC)
        //esto reemplaza el new de java
        binding.seekBarVolumen.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                TODO("Not yet implemented")
            }
        } )
    }
}