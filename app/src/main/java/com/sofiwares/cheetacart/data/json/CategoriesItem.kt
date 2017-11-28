package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class CategoriesItem(

	@field:SerializedName("hide")
	val hide: Boolean? = null,

	@field:SerializedName("parent_id")
	val parentId: Any? = null,

	@field:SerializedName("image_url")
	val imageUrl: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("display_order")
	val displayOrder: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("image_id")
	val imageId: String? = null
)