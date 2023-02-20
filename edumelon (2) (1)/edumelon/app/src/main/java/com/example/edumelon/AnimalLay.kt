package com.example.edumelon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animal_lay.*
import kotlinx.android.synthetic.main.activity_birthdaylay.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_videos.button1
import kotlinx.android.synthetic.main.activity_videos.button2
import kotlinx.android.synthetic.main.activity_videos.cardView2

class AnimalLay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_lay)

        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.blink)
        dino.startAnimation(animationBounce)

        button1.setOnClickListener {
            var intent2: Intent = Intent(this, Birthdaylay::class.java)
            startActivity(intent2)
        }
        button2.setOnClickListener {
            var intent3: Intent = Intent(this, Lullaby::class.java)
            startActivity(intent3)
        }

        cardView2.setOnClickListener {
            var intent3: Intent = Intent(this, AnimalQuiz::class.java)
            startActivity(intent3)
        }
        dino.setOnClickListener {
            var intent: Intent = Intent(this, SongsLyrics::class.java)
            startActivity(intent)
        }
    }
}