package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity: Activity() {
    override fun onCreate(savedIstanceState: Bundle?){
        super.onCreate(savedIstanceState)
        setContentView(R.layout.activity_main)
    }
}