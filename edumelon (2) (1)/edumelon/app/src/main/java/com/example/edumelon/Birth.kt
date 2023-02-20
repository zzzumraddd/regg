package com.example.edumelon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.birth.*

class Birth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.birth)

        val animationBounce2 = AnimationUtils.loadAnimation(this, R.anim.blink2)
        imageView10.startAnimation(animationBounce2)

        imageView4.setOnClickListener {
            imageView10.visibility = View.VISIBLE
            val animationBounce2 = AnimationUtils.loadAnimation(this, R.anim.blink2)
            imageView10.startAnimation(animationBounce2)
        }

    }
}