package com.sofiwares.cheetacart.data.converter

import com.sofiwares.cheetacart.data.formatter.CurrencyFormatter

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class PackagingTypeToPriceConverter(private val packagingType: String, private val price: Double) {
    fun convert(): String {
        return when(packagingType) {
            "unit" -> return "${CurrencyFormatter(price).format()}/Unit"
            "case" -> return "${CurrencyFormatter(price).format()}/Case"
            "weight" -> "${CurrencyFormatter(price).format()}/Weight"
            else -> ""
        }
    }
}