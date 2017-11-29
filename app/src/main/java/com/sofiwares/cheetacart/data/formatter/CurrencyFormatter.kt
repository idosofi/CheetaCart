package com.sofiwares.cheetacart.data.formatter

import java.text.NumberFormat
import java.util.*

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CurrencyFormatter(private val value: Double) {

    /**
     * TODO: Handle different currencies
     */
    fun format(): String {
        return "$${NumberFormat.getNumberInstance(Locale.getDefault()).format(value)}"
    }
}