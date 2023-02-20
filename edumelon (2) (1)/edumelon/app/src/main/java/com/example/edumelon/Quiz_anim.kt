package com.example.edumelon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_quiz_anim.*

class Quiz_anim : AppCompatActivity(), View.OnClickListener {
    var index=0
    var savollar = arrayListOf<Test>()
    var booleanarr = arrayOfNulls<Boolean>(4)
    var z = 0
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_anim)

        savollar.add(
            Test(
                "Sloths often sleep while:?",
                "Hanging upside down",
                "Climbing",
                "Standing up",
                "Pooping",
                "Hanging upside down"
            )
        )
        savollar.add(
            Test(
                "What is the name of the biggest shark?",
                "Blue shark",
                "Whale shark",
                "Lion shark",
                "Dinoshark",
                "Whale shark"
            )
        )
        savollar.add(Test("How many legs does a dog have?",
            "4",
            "5",
            "3",
            "2",
            "4"))
        savollar.add(
            Test(
                "What is the only animal that can’t jump?",
                "Whale",
                "Dog",
                "Elephant",
                "Cat",
                "Elephant"
            )
        )
        questionNumber(savollar.size)
        question(0)

        next.setOnClickListener {
            if (index == 3) {
                index = 0
                question(index)
                group.clearCheck()
            } else {
                index++
                question(index)
                group.clearCheck()

            }
        }
        answer1.setOnClickListener{
            if(index == 0 && q1 == 0){
                q1++
                z++
            }
            if(index == 1 && q2 > 0){
                z--
            }
            if(index == 2 && q3 == 0){
                q3++
                z++
            }
            if(index == 3 && q4 > 0){
                z--
            }
        }
        answer2.setOnClickListener{
            if(index == 0 && q1 > 0){
                z--
            }
            if(index == 1 && q2 == 0){
                q2++
                z++
            }
            if(index == 2 && q3 > 0){
                z--
            }
            if(index == 3 && q4 > 0){
                z--
            }
        }
        answer3.setOnClickListener {
            if(index == 0 && q1 > 0){
                z--
            }
            if(index == 1 && q2 > 0){
                z--
            }
            if(index == 2 && q3 > 0){
                z--
            }
            if(index == 3 && q4 == 0){
                q4++
                z++
            }
        }
        answer4.setOnClickListener {
            if(index == 0 && q1 > 0){
                z--
            }
            if(index == 1 && q2 > 0){
                z--
            }
            if(index == 2 && q3 > 0){
                z--
            }
            if(index == 3 && q4 > 0){
                z--
            }
        }
        finish.setOnClickListener {
            score.setText("You have reached " + z)
        }
    }

        fun question(index:Int){
            var test1=savollar[index]
            question.text=test1.savol
            answer1.text=test1.variant1
            answer2.text=test1.variant2
            answer3.text=test1.variant3
            answer4.text=test1.variant4

        }

        fun questionNumber(n:Int) {
            for (i in 1..n) {

                var btn = Button(this)
                btn.id = i
                btn.text = "$i"
                btn.tag = "$i"
                btn.setOnClickListener(this)
                btn.setBackgroundColor(Color.rgb(255, 108, 62))
                btn.setOnClickListener(this)
                q_number.addView(btn)
            }
        }

    override fun onClick(p0: View?) {
        val btn = findViewById<Button>(p0!!.id)
        index = btn.tag.toString().toInt()-1
        question(index)
        group.clearCheck()
    }

}