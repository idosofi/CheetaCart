package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class OrderItemsInformationItem(val product: Product?,
                                     val quantity: Int = 0,
                                     @SerializedName("product_id")
                                     val productId: Int = 0,
                                     @SerializedName("packaging_type")
                                     val packagingType: String = "",
                                     @SerializedName("sub_total")
                                     val subTotal: Int = 0,
                                     val id: Int = 0,
                                     val substitutable: Boolean = false,
                                     @SerializedName("order_id")
                                     val orderId: Int = 0)