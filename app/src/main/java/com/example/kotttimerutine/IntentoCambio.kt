package com.example.kotttimerutine

import android.media.AudioManager

class IntentoCambio {
    //Se convirtio de java a kotlin
    var audioManager: AudioManager? = null

    //audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    //get max value volumen
    var maxVolumen = audioManager!!.getStreamMaxVolume(AudioManager.STREAM_MUSIC)

    //get current volumen
    var curVolumen = audioManager!!.getStreamVolume(AudioManager.STREAM_MUSIC)
}