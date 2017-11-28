package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class Cart(val note: String = "",
                @SerializedName("delivery_address")
                val deliveryAddress: String = "",
                @SerializedName("cart_total")
                val cartTotal: Int = 0,
                @SerializedName("delivery_time_end")
                val deliveryTimeEnd: Int = 0,
                @SerializedName("restaurant_id")
                val restaurantId: Int = 0,
                @SerializedName("promo_code_discount")
                val promoCodeDiscount: Int = 0,
                @SerializedName("delivery_date_iso8601")
                val deliveryDateIso: String = "",
                @SerializedName("promo_code_validation")
                val promoCodeValidation: Boolean = false,
                @SerializedName("promo_code")
                val promoCode: Any? = null,
                @SerializedName("under_subscription")
                val underSubscription: Boolean = false,
                @SerializedName("delivery_fee")
                val deliveryFee: Int = 0,
                val total: Int = 0,
                @SerializedName("available_delivery_times")
                val availableDeliveryTimes: List<AvailableDeliveryTimesItem>?,
                @SerializedName("local_time_iso8601")
                val localTimeIso: String = "",
                @SerializedName("created_at_iso8601")
                val createdAtIso: String = "",
                @SerializedName("error_description")
                val errorDescription: String = "",
                @SerializedName("free_delivery_discount")
                val freeDeliveryDiscount: Int = 0,
                val id: Int = 0,
                @SerializedName("same_day_charge")
                val sameDayCharge: Int = 0,
                @SerializedName("payment_method")
                val paymentMethod: String = "",
                @SerializedName("possible_fill_in")
                val possibleFillIn: Boolean = false,
                @SerializedName("subscription_fee")
                val subscriptionFee: Int = 0,
                @SerializedName("same_day_charge_amount")
                val sameDayChargeAmount: Int = 0,
                @SerializedName("fill_in")
                val fillIn: Boolean = false,
                @SerializedName("promo_code_discount_cash")
                val promoCodeDiscountCash: Int = 0,
                @SerializedName("order_items_information")
                val orderItemsInformation: List<OrderItemsInformationItem>?,
                @SerializedName("delivery_date")
                val deliveryDate: String = "",
                @SerializedName("credit_card_charge")
                val creditCardCharge: Int = 0,
                @SerializedName("first_delivery_discount")
                val firstDeliveryDiscount: Int = 0,
                @SerializedName("sub_total")
                val subTotal: Int = 0,
                @SerializedName("error_code")
                val errorCode: Any? = null,
                @SerializedName("delivery_time_start")
                val deliveryTimeStart: Int = 0,
                @SerializedName("last_time_modified_int")
                val lastTimeModifiedInt: Long = 0,
                val status: String = "")