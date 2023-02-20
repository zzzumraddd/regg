package com.example.edumelon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animal_quiz.*
import kotlinx.android.synthetic.main.activity_birthdaylay.*

class AnimalQuiz : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_quiz)
        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.blink4)
        imageView7.startAnimation(animationBounce)
        imageView8.setOnClickListener {
            var intent3: Intent = Intent(this, Quiz_anim::class.java)
            startActivity(intent3)
        }


    }
}