package com.mukul.jan.flavor_paid

import android.app.Activity
import android.content.Intent

class RootFlavorEntry(private val activity: Activity) {
    fun start() {
        val intent = Intent(activity, FlavorPaidActivity::class.java)
        activity.startActivity(intent)
    }
}