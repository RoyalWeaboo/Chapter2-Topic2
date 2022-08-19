package com.malikazizali.helloworldkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        funNew()
    }

    fun funNew(){
        val angkaSatu : Int = 1
    }
}