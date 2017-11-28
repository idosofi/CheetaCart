package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class CategoriesItem(val hide: Boolean = false,
                          @SerializedName("parent_id")
                          val parentId: Any? = null,
                          @SerializedName("image_url")
                          val imageUrl: Any? = null,
                          val name: String = "",
                          @SerializedName("display_order")
                          val displayOrder: Int = 0,
                          val description: String = "",
                          val id: Int = 0,
                          @SerializedName("image_id")
                          val imageId: String = "")