package com.mukul.jan.multi_module_flavor

import android.app.Activity

interface FlavorEntry {
    fun startFlavorEntry(activity: Activity)
}

class BaseFlavorBuilder(
    private val provider: BaseFlavorProvider,
) : FlavorEntry {
    companion object {
        private var instance: BaseFlavorBuilder? = null
        fun build(): BaseFlavorBuilder {
            if (instance != null) return instance!!
            synchronized(this) {
                if (instance == null) {
                    instance = BaseFlavorBuilder(
                        provider = BaseFlavorProvider()
                    )
                }
            }
            return instance!!
        }
    }

    override fun startFlavorEntry(activity: Activity) {
        val currentFlavorName = BuildConfig.FLAVOR
        val flavor = provider.getAllFlavors().find { it.name == currentFlavorName }!!

        val clazz = Class.forName(flavor.rootEntry)
        val constructor = clazz.getConstructor(Activity::class.java)
        val obj = constructor.newInstance(activity)

        val startMethod = clazz.getMethod("start")
        startMethod.invoke(obj)
    }
}