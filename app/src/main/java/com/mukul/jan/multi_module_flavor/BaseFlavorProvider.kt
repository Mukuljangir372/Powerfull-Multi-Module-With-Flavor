package com.mukul.jan.multi_module_flavor

/**
 * @param name : declared name in gradle scrip
 * @param moduleName : declared module name in project
 * @param rootEntry : declared root activity
 */

data class Flavor(
    val name: String,
    val moduleName: String,
    val rootEntry: String,
)

/**
 * @see BaseFlavorProvider : contains all declared flavors in project
 */

class BaseFlavorProvider {
    fun getAllFlavors(): List<Flavor> {
        return listOf(
            Flavor(
                name = "free",
                moduleName = "flavor-free",
                rootEntry = "com.mukul.jan.flavor_free.RootFlavorEntry"
            ),
            Flavor(
                name = "paid",
                moduleName = "flavor-paid",
                rootEntry = "com.mukul.jan.flavor_paid.RootFlavorEntry"
            ),
            Flavor(
                name = "full",
                moduleName = "flavor-full",
                rootEntry = "com.mukul.jan.flavor_full.RootFlavorEntry"
            )
        )
    }
}