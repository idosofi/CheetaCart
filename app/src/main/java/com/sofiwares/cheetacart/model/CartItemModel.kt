package com.sofiwares.cheetacart.model

/**
 * Created by Ido Sofi on 11/27/2017.
 */
interface CartItemModel {
    val name: String
    val price: Double
    val subTotal: Double
    var quantity: Double
    val packagingType: String
    val unitPhotoUrl: String
    val casePhotoUrl: String
    val weightPhotoUrl: String
    val substitutable: Boolean
}