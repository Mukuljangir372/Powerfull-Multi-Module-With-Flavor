package com.mukul.jan.flavor_full

import android.app.Activity
import android.content.Intent

class RootFlavorEntry(private val activity: Activity) {
    fun start() {
        val intent = Intent(activity, FlavorFullActivity::class.java)
        activity.startActivity(intent)
    }
}