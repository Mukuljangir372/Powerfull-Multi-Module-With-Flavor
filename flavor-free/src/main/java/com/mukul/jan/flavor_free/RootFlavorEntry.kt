package com.mukul.jan.flavor_free

import android.app.Activity
import android.content.Intent

class RootFlavorEntry(private val activity: Activity) {
    fun start() {
        val intent = Intent(activity, FlavorFreeActivity::class.java)
        activity.startActivity(intent)
    }
}