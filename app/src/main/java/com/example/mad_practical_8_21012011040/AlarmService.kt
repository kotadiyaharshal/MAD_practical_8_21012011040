package com.example.mad_practical_8_21012011040






import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {

    lateinit var player : MediaPlayer

    override fun onBind(intent: Intent): IBinder {
        TODO("Practical-8")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null) {
            player = MediaPlayer.create(this,R.raw.app_src_main_res_raw_alarm)
            player.start()
        }

        return START_STICKY
    }

    override fun onDestroy() {
        player.stop()
        super.onDestroy()
    }
}