package com.sofiwares.cheetacart.data.converter

import android.graphics.Color

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class SubstitutableToColorConverter(private val isSubstitutable: Boolean) {
    fun convert(): Int {
        return when(isSubstitutable) {
            true -> Color.GREEN
            false -> Color.RED
        }
    }
}