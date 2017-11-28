package com.sofiwares.cheetacart.data.converter

import android.content.res.ColorStateList
import android.graphics.Color

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class SubstitutableToColorStateListConveter(private val isSubstitutable: Boolean) {
    private val states = arrayOf(intArrayOf(android.R.attr.state_enabled), // enabled
            intArrayOf(-android.R.attr.state_enabled)  // disabled
    )

    fun convert(): ColorStateList {
        return when(isSubstitutable) {
            true -> ColorStateList(states, intArrayOf(Color.GREEN, Color.GREEN))
            false -> ColorStateList(states, intArrayOf(Color.RED, Color.RED))
        }
    }
}