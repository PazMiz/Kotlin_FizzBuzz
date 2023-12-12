package com.example.fizzbuzzkmm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fizzbuzzshared.FizzBuzzShared

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = 1
        val end = 100

        val fizzBuzzOutput = FizzBuzzShared.buildFizzBuzzOutput(start, end)
        println(fizzBuzzOutput)
    }
}
