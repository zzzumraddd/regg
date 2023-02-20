package com.example.edumelon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sky.*

class Sky : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sky)

        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.moonappear)
        star11.startAnimation(animationBounce)
        sky.setOnClickListener {
            val animationBounce2 = AnimationUtils.loadAnimation(this, R.anim.appear)
            star1.startAnimation(animationBounce2)
            star2.startAnimation(animationBounce2)
            star3.startAnimation(animationBounce2)
            star4.startAnimation(animationBounce2)
            star5.startAnimation(animationBounce2)
            star6.startAnimation(animationBounce2)
            star7.startAnimation(animationBounce2)
            star8.startAnimation(animationBounce2)
            star9.startAnimation(animationBounce2)
            star10.startAnimation(animationBounce2)
            star12.startAnimation(animationBounce2)
            star13.startAnimation(animationBounce2)
            star14.startAnimation(animationBounce2)
            star15.startAnimation(animationBounce2)
        }
            star11.setOnClickListener {
                sky.setBackgroundColor(Color.rgb(93, 112, 228))
                val animationBounce2 = AnimationUtils.loadAnimation(this, R.anim.appear)
                val animationBounce3 = AnimationUtils.loadAnimation(this, R.anim.blink2)
                star1.visibility = View.INVISIBLE
                star2.visibility = View.INVISIBLE
                star3.visibility = View.INVISIBLE
                star4.visibility = View.INVISIBLE
                star5.visibility = View.INVISIBLE
                star6.visibility = View.INVISIBLE
                star7.visibility = View.INVISIBLE
                star8.visibility = View.INVISIBLE
                star9.visibility = View.INVISIBLE
                star10.visibility = View.INVISIBLE
                star11.visibility = View.INVISIBLE
                star12.visibility = View.INVISIBLE
                star13.visibility = View.INVISIBLE
                star14.visibility = View.INVISIBLE
                star15.visibility = View.INVISIBLE
                day.visibility = View.VISIBLE
                sun.startAnimation(animationBounce3)
                val animationBounce = AnimationUtils.loadAnimation(this, R.anim.cloud)
                cloud1.startAnimation(animationBounce)
                cloud2.startAnimation(animationBounce)
                cloud3.startAnimation(animationBounce)
                cloud4.startAnimation(animationBounce)
                cloud5.startAnimation(animationBounce)
                cloud6.startAnimation(animationBounce)
                cloud7.startAnimation(animationBounce)
                cloud8.startAnimation(animationBounce)
                cloud9.startAnimation(animationBounce)
                cloud12.startAnimation(animationBounce)
                cloud11.startAnimation(animationBounce)
                cloud13.startAnimation(animationBounce)
                cloud14.startAnimation(animationBounce)
                cloud15.startAnimation(animationBounce)

            }

        sun.setOnClickListener {
            sky.setBackgroundColor(Color.rgb(10, 34, 168))
            star1.visibility = View.VISIBLE
            star2.visibility = View.VISIBLE
            star3.visibility = View.VISIBLE
            star4.visibility = View.VISIBLE
            star5.visibility = View.VISIBLE
            star6.visibility = View.VISIBLE
            star7.visibility = View.VISIBLE
            star8.visibility = View.VISIBLE
            star9.visibility = View.VISIBLE
            star10.visibility = View.VISIBLE
            star11.visibility = View.VISIBLE
            star12.visibility = View.VISIBLE
            star13.visibility = View.VISIBLE
            star14.visibility = View.VISIBLE
            star15.visibility = View.VISIBLE
            day.visibility = View.INVISIBLE

        }


        val animationBounce3 = AnimationUtils.loadAnimation(this, R.anim.moonappear)
        star1.startAnimation(animationBounce3)
        star2.startAnimation(animationBounce3)
        star3.startAnimation(animationBounce3)
        star4.startAnimation(animationBounce3)
        star5.startAnimation(animationBounce3)
        star6.startAnimation(animationBounce3)
        star7.startAnimation(animationBounce3)
        star8.startAnimation(animationBounce3)
        star9.startAnimation(animationBounce3)
        star10.startAnimation(animationBounce3)
        star12.startAnimation(animationBounce3)
        star13.startAnimation(animationBounce3)
        star14.startAnimation(animationBounce3)
        star15.startAnimation(animationBounce3)


    }


}