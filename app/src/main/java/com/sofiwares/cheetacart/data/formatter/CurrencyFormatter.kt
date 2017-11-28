package com.sofiwares.cheetacart.data.formatter

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CurrencyFormatter(private val value: Double) {

    /**
     * TODO: Handle different currencies
     */
    fun format(): String {
        return "$$value"
    }
}