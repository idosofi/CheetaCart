package com.sofiwares.cheetacart.data.json

import com.google.gson.annotations.SerializedName

data class Product(@SerializedName("unit_barcode")
                   val unitBarcode: String = "",
                   @SerializedName("pack_photo_file")
                   val packPhotoFile: String = "",
                   @SerializedName("weight_photo_hq_url")
                   val weightPhotoHqUrl: String = "",
                   @SerializedName("items_per_unit")
                   val itemsPerUnit: Int = 0,
                   val available: Boolean = false,
                   @SerializedName("weight_discount_threshold")
                   val weightDiscountThreshold: Any? = null,
                   @SerializedName("pack_barcode")
                   val packBarcode: Any? = null,
                   @SerializedName("unit_photo_filename")
                   val unitPhotoFilename: String = "",
                   @SerializedName("avg_unit_weight")
                   val avgUnitWeight: Any? = null,
                   @SerializedName("unit_photo_hq_url")
                   val unitPhotoHqUrl: String = "",
                   val id: Int = 0,
                   val categories: List<CategoriesItem>?,
                   val sku: String = "",
                   @SerializedName("pack_photo_hq_url")
                   val packPhotoHqUrl: String = "",
                   @SerializedName("avg_case_weight")
                   val avgCaseWeight: Any? = null,
                   @SerializedName("updated_at_iso8601")
                   val updatedAtIso: String = "",
                   @SerializedName("weight_orderable")
                   val weightOrderable: Boolean = false,
                   @SerializedName("unit_price")
                   val unitPrice: Int = 0,
                   @SerializedName("weight_discount_price")
                   val weightDiscountPrice: Any? = null,
                   @SerializedName("weight_photo_filename")
                   val weightPhotoFilename: String = "",
                   @SerializedName("grouped_by_category_name")
                   val groupedByCategoryName: String = "",
                   @SerializedName("case_price")
                   val casePrice: Int = 0,
                   @SerializedName("units_per_case")
                   val unitsPerCase: Int = 0,
                   val name: String = "",
                   @SerializedName("case_orderable")
                   val caseOrderable: Boolean = false,
                   @SerializedName("weight_price")
                   val weightPrice: Int = 0)