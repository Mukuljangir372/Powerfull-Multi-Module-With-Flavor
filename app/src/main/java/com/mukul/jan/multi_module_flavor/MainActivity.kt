package com.mukul.jan.multi_module_flavor

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * Each Product flavor depends on a flavor module in build.gradle
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseFlavorBuilder.build().startFlavorEntry(this)
    }
}