package com.example.edumelon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_songs_lyrics.*

class SongsLyrics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs_lyrics)
        stars.setOnClickListener{
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.zoom)
            star1.startAnimation(animationBounce)
            star2.startAnimation(animationBounce)
            star3.startAnimation(animationBounce)
            star4.startAnimation(animationBounce)
        }
        ladybugs.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.rotation)
            ladybug1.startAnimation(animationBounce)
            ladybug2.startAnimation(animationBounce)
            ladybug3.startAnimation(animationBounce)
            ladybug4.startAnimation(animationBounce)
        }
        cakes.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.fade)
            cake1.startAnimation(animationBounce)
            cake2.startAnimation(animationBounce)
            cake3.startAnimation(animationBounce)
            cake4.startAnimation(animationBounce)
        }

    }
}