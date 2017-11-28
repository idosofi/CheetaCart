package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class AvailableDeliveryTimesItem(val date: String = "",
                                      val reserved: Boolean = false,
                                      val start: Int = 0,
                                      @SerializedName("show_last_spots_left")
                                      val showLastSpotsLeft: Boolean = false,
                                      val end: Int = 0,
                                      @SerializedName("spots_left")
                                      val spotsLeft: Int = 0)