package com.example.xo

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var count = 0
    var ONE1 = 0
    var TWO1 = 0
    var THREE1 = 0
    var FOUR1 = 0
    var FIVE1 = 0
    var SIX1 = 0
    var SEVEN1 = 0
    var EIGHT1 = 0
    var NINE1 = 0
    var block = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.Win)
        val ButtonONE = findViewById<TextView>(R.id.textView)
        val ButtonTWO = findViewById<TextView>(R.id.textView2)
        val ButtonTHREE = findViewById<TextView>(R.id.textView3)
        val ButtonFOUR = findViewById<TextView>(R.id.textView4)
        val ButtonFIVE = findViewById<TextView>(R.id.textView5)
        val ButtonSIX = findViewById<TextView>(R.id.textView6)
        val ButtonSEVEN = findViewById<TextView>(R.id.textView7)
        val ButtonEIGHT = findViewById<TextView>(R.id.textView8)
        val ButtonNINE = findViewById<TextView>(R.id.textView9)
        val ButtonReset = findViewById<ImageButton>(R.id.reset)

        ButtonONE.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonONE.setText("+")
                    ONE1 = 1
                } else {
                    ButtonONE.setText("o")
                    ONE1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonTWO.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonTWO.setText("+")
                    TWO1 = 1
                } else {
                    ButtonTWO.setText("o")
                    TWO1 = 2
                }
                count++
                check(text)
            }}
        )



        ButtonTHREE.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonTHREE.setText("+")
                    THREE1 = 1
                } else {
                    ButtonTHREE.setText("o")
                    THREE1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonFOUR.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonFOUR.setText("+")
                    FOUR1 = 1
                } else {
                    ButtonFOUR.setText("o")
                    FOUR1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonFIVE.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonFIVE.setText("+")
                    FIVE1 = 1
                } else {
                    ButtonFIVE.setText("o")
                    FIVE1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonSIX.setOnClickListener(
            View.OnClickListener {
if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonSIX.setText("+")
                    SIX1 = 1
                } else {
                    ButtonSIX.setText("o")
                    SIX1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonSEVEN.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonSEVEN.setText("+")
                    SEVEN1 = 1
                } else {
                    ButtonSEVEN.setText("o")
                    SEVEN1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonEIGHT.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonEIGHT.setText("+")
                    EIGHT1 = 1
                } else {
                    ButtonEIGHT.setText("o")
                    EIGHT1 = 2
                }
                count++
                check(text)
            }}
        )

        ButtonNINE.setOnClickListener(
            View.OnClickListener {
                if (checkBlock(block)){
                if (count % 2 == 0) {
                    ButtonNINE.setText("+")
                    NINE1 = 1
                } else {
                    ButtonNINE.setText("o")
                    NINE1 = 2
                }
                count++
                check(text)
            }}
        )
        ButtonReset.setOnClickListener(View.OnClickListener {
            count = 0
           ONE1 = 0
             TWO1 = 0
             THREE1 = 0
             FOUR1 = 0
             FIVE1 = 0
             SIX1 = 0
            SEVEN1 = 0
             EIGHT1 = 0
             NINE1= 0
            ButtonNINE.setText("")
            ButtonEIGHT.setText("")
            ButtonSEVEN.setText("")
            ButtonSIX.setText("")
            ButtonFIVE.setText("")
            ButtonFOUR.setText("")
            ButtonTHREE.setText("")
            ButtonTWO.setText("")
            ButtonONE.setText("")
            text.text = ""
            block = 0
        })

    }
   fun checkBlock (block: Int): Boolean {
       return block == 1
   }

    fun check(text:TextView) {
        if ((ONE1 == TWO1 && ONE1 == THREE1 && ONE1 == 1)
            || (ONE1 == FIVE1 && ONE1 == NINE1 && ONE1 == 1)
            || (ONE1 == FOUR1 && ONE1 == SEVEN1 && ONE1 == 1)
            || (TWO1 == FIVE1 && TWO1 == EIGHT1 && FIVE1 == 1)
            || (THREE1 == FIVE1 && THREE1 == SEVEN1 && FIVE1 == 1)
            || (THREE1 == SIX1 && THREE1 == NINE1 && NINE1 == 1)
            || (FOUR1 == FIVE1 && FOUR1 == SIX1 && FIVE1 == 1)
            || (SEVEN1 == EIGHT1 && SEVEN1 == NINE1 && NINE1 == 1)
        ) {
            text.text = "КРЕСТИКИ WIN"
            block = 1


        } else if ((ONE1 == TWO1 && ONE1 == THREE1 && ONE1 == 2)
            || (ONE1 == FIVE1 && ONE1 == NINE1 && ONE1 == 2)
            || (ONE1 == FOUR1 && ONE1 == SEVEN1 && ONE1 == 2)
            || (TWO1 == FIVE1 && TWO1 == EIGHT1 && FIVE1 == 2)
            || (THREE1 == FIVE1 && THREE1 == SEVEN1 && FIVE1 == 2)
            || (THREE1 == SIX1 && THREE1 == NINE1 && NINE1 == 2)
            || (FOUR1 == FIVE1 && FOUR1 == SIX1 && FIVE1 == 2)
            || (SEVEN1 == EIGHT1 && SEVEN1 == NINE1 && NINE1 == 2)
        ) {


            text.text = "НОЛИКИ WIN"
            block = 1
        }
    }
}