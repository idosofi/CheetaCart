package com.sofiwares.cheetacart.data

/**
 * Created by Ido Sofi on 11/27/2017.
 */
enum class PackagingType {
    UNIT,
    CASE,
    WEIGHT;

    companion object {
        fun fromString(value: String): PackagingType {
            return when(value.toLowerCase()) {
                "unit" -> UNIT
                "case" -> CASE
                "weight" -> WEIGHT
                else -> UNIT
            }
        }
    }
}