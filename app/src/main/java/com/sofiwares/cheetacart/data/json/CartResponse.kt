package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class CartResponse(

	@field:SerializedName("note")
	val note: String? = null,

	@field:SerializedName("delivery_address")
	val deliveryAddress: String? = null,

	@field:SerializedName("cart_total")
	val cartTotal: Int? = null,

	@field:SerializedName("delivery_time_end")
	val deliveryTimeEnd: Int? = null,

	@field:SerializedName("restaurant_id")
	val restaurantId: Int? = null,

	@field:SerializedName("promo_code_discount")
	val promoCodeDiscount: Int? = null,

	@field:SerializedName("delivery_date_iso8601")
	val deliveryDateIso8601: String? = null,

	@field:SerializedName("promo_code_validation")
	val promoCodeValidation: Boolean? = null,

	@field:SerializedName("promo_code")
	val promoCode: Any? = null,

	@field:SerializedName("under_subscription")
	val underSubscription: Boolean? = null,

	@field:SerializedName("delivery_fee")
	val deliveryFee: Int? = null,

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("available_delivery_times")
	val availableDeliveryTimes: List<AvailableDeliveryTimesItem?>? = null,

	@field:SerializedName("local_time_iso8601")
	val localTimeIso8601: String? = null,

	@field:SerializedName("created_at_iso8601")
	val createdAtIso8601: String? = null,

	@field:SerializedName("error_description")
	val errorDescription: String? = null,

	@field:SerializedName("free_delivery_discount")
	val freeDeliveryDiscount: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("same_day_charge")
	val sameDayCharge: Int? = null,

	@field:SerializedName("payment_method")
	val paymentMethod: String? = null,

	@field:SerializedName("possible_fill_in")
	val possibleFillIn: Boolean? = null,

	@field:SerializedName("subscription_fee")
	val subscriptionFee: Int? = null,

	@field:SerializedName("same_day_charge_amount")
	val sameDayChargeAmount: Int? = null,

	@field:SerializedName("fill_in")
	val fillIn: Boolean? = null,

	@field:SerializedName("promo_code_discount_cash")
	val promoCodeDiscountCash: Double? = null,

	@field:SerializedName("order_items_information")
	val orderItemsInformation: List<OrderItemsInformationItem>? = null,

	@field:SerializedName("delivery_date")
	val deliveryDate: String? = null,

	@field:SerializedName("credit_card_charge")
	val creditCardCharge: Int? = null,

	@field:SerializedName("first_delivery_discount")
	val firstDeliveryDiscount: Int? = null,

	@field:SerializedName("sub_total")
	val subTotal: Int? = null,

	@field:SerializedName("error_code")
	val errorCode: Any? = null,

	@field:SerializedName("delivery_time_start")
	val deliveryTimeStart: Int? = null,

	@field:SerializedName("last_time_modified_int")
	val lastTimeModifiedInt: Long? = null,

	@field:SerializedName("status")
	val status: String? = null
)