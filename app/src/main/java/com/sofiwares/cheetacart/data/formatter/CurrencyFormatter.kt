package com.sofiwares.cheetacart.data.formatter

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class CurrencyFormatter(val value: Float) {

    /**
     * TODO: Handle different currencies
     */
    fun format(): String {
        return "/$$value"
    }
}