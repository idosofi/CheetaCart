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
    val unit_photo_url: String
    val case_photo_url: String
    val weight_photo_url: String
    val substitutable: Boolean
}