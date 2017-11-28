package com.sofiwares.cheetacart.model

import com.sofiwares.cheetacart.data.PackagingType

/**
 * Created by Ido Sofi on 11/27/2017.
 */
interface CartItemModel {
    val name: String
    val price: Float
    val subTotal: Float
    var quantity: Float
    val packagingType: PackagingType
    val unitPhotoUrl: String
    val casePhotoUrl: String
    val weightPhotoUrl: String
    val substitutable: Boolean
}