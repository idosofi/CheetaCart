package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class Product(

	@field:SerializedName("unit_barcode")
	val unitBarcode: String? = null,

	@field:SerializedName("pack_photo_file")
	val packPhotoFile: String? = null,

	@field:SerializedName("weight_photo_hq_url")
	val weightPhotoHqUrl: String? = null,

	@field:SerializedName("items_per_unit")
	val itemsPerUnit: Int? = null,

	@field:SerializedName("available")
	val available: Boolean? = null,

	@field:SerializedName("weight_discount_threshold")
	val weightDiscountThreshold: Any? = null,

	@field:SerializedName("pack_barcode")
	val packBarcode: Any? = null,

	@field:SerializedName("unit_photo_filename")
	val unitPhotoFilename: String? = null,

	@field:SerializedName("avg_unit_weight")
	val avgUnitWeight: Any? = null,

	@field:SerializedName("unit_photo_hq_url")
	val unitPhotoHqUrl: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null,

	@field:SerializedName("sku")
	val sku: String? = null,

	@field:SerializedName("pack_photo_hq_url")
	val packPhotoHqUrl: String? = null,

	@field:SerializedName("avg_case_weight")
	val avgCaseWeight: Any? = null,

	@field:SerializedName("updated_at_iso8601")
	val updatedAtIso8601: String? = null,

	@field:SerializedName("weight_orderable")
	val weightOrderable: Boolean? = null,

	@field:SerializedName("unit_price")
	val unitPrice: Int? = null,

	@field:SerializedName("weight_discount_price")
	val weightDiscountPrice: Any? = null,

	@field:SerializedName("weight_photo_filename")
	val weightPhotoFilename: String? = null,

	@field:SerializedName("grouped_by_category_name")
	val groupedByCategoryName: String? = null,

	@field:SerializedName("case_price")
	val casePrice: Int? = null,

	@field:SerializedName("units_per_case")
	val unitsPerCase: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("case_orderable")
	val caseOrderable: Boolean? = null,

	@field:SerializedName("weight_price")
	val weightPrice: Int? = null
)