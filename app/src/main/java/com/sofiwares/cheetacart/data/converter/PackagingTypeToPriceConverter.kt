package com.sofiwares.cheetacart.data.converter

import com.sofiwares.cheetacart.data.PackagingType
import com.sofiwares.cheetacart.data.formatter.CurrencyFormatter

/**
 * Created by Ido Sofi on 11/27/2017.
 */
class PackagingTypeToPriceConverter(private val packagingType: PackagingType, private val price: Float) {
    fun convert(): String {
        return when(packagingType) {
            PackagingType.UNIT -> return "${CurrencyFormatter(price).format()}/Unit"
            PackagingType.CASE -> return "${CurrencyFormatter(price).format()}/Case"
            PackagingType.WEIGHT -> "${CurrencyFormatter(price).format()}/Weight"
        }
    }
}