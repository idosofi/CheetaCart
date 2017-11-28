package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class AvailableDeliveryTimesItem(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("reserved")
	val reserved: Boolean? = null,

	@field:SerializedName("start")
	val start: Int? = null,

	@field:SerializedName("show_last_spots_left")
	val showLastSpotsLeft: Boolean? = null,

	@field:SerializedName("end")
	val end: Int? = null,

	@field:SerializedName("spots_left")
	val spotsLeft: Int? = null
)