package com.example.edumelon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_videos.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animationBounce = AnimationUtils.loadAnimation(this, R.anim.blink)
        imageView.startAnimation(animationBounce)
        val animationBounce2 = AnimationUtils.loadAnimation(this, R.anim.blink2)
        imageView2.startAnimation(animationBounce2)
        val animationBounce3 = AnimationUtils.loadAnimation(this, R.anim.lettersanim)
        m.startAnimation(animationBounce3)
        val animationBounce4 = AnimationUtils.loadAnimation(this, R.anim.emelon)
        e.startAnimation(animationBounce4)
        val animationBounce5 = AnimationUtils.loadAnimation(this, R.anim.lmelon)
        l.startAnimation(animationBounce5)
        val animationBounce6 = AnimationUtils.loadAnimation(this, R.anim.omelon)
        o.startAnimation(animationBounce6)
        val animationBounce7 = AnimationUtils.loadAnimation(this, R.anim.nmelon)
        n.startAnimation(animationBounce7)
        val animationBounce9 = AnimationUtils.loadAnimation(this, R.anim.blink3)
        edu.startAnimation(animationBounce9)
//        val animationBounce8 = AnimationUtils.loadAnimation(this, R.anim.rotation)
//        edu.startAnimation(animationBounce8)
        imageView.setOnClickListener {
            var intent: Intent = Intent(this, AnimalLay::class.java)
            startActivity(intent)
        }


    }
}