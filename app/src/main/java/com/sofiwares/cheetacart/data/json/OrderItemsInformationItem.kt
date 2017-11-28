package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName
import com.sofiwares.cheetacart.model.CartItemModel

data class OrderItemsInformationItem(

	@field:SerializedName("product")
	val product: Product? = null,

	@field:SerializedName("quantity")
	override var quantity: Double,

	@field:SerializedName("product_id")
	val productId: Int? = null,

	@field:SerializedName("packaging_type")
	override val packagingType: String,

	@field:SerializedName("sub_total")
	override val subTotal: Double,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("substitutable")
	override val substitutable: Boolean,

	@field:SerializedName("order_id")
	val orderId: Int? = null): CartItemModel {

	override val name: String
		get() = product?.name ?: ""
	override val price: Double
		get() = when(packagingType) {
			"unit" -> product?.unitPrice?.toDouble() ?: 0.0
			"case" -> product?.casePrice?.toDouble() ?: 0.0
			"weight" -> product?.weightPrice?.toDouble() ?: 0.0
			else -> 0.0
		}
	override val unitPhotoUrl: String
		get() = product?.unitPhotoFilename ?: ""
	override val casePhotoUrl: String
		get() = product?.packPhotoFile ?: ""
	override val weightPhotoUrl: String
		get() = product?.weightPhotoFilename ?: ""
}