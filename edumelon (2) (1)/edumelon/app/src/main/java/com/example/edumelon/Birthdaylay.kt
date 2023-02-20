package com.example.edumelon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_birthdaylay.*
import kotlinx.android.synthetic.main.activity_videos.button1
import kotlinx.android.synthetic.main.activity_videos.button2

class Birthdaylay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaylay)


        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.blink2)
        imageView3.startAnimation(animationBounce)
        button1.setOnClickListener {
            var intent2: Intent = Intent(this, Lullaby::class.java)
            startActivity(intent2)
        }
        bd.setOnClickListener {
            var intent2: Intent = Intent(this, Birth::class.java)
            startActivity(intent2)
        }
        button2.setOnClickListener {
            var intent3: Intent = Intent(this, AnimalLay::class.java)
            startActivity(intent3)
        }
        imageView3.setOnClickListener {
            var intent: Intent = Intent(this, SongsLyrics::class.java)
            startActivity(intent)
        }
    }
}