package org.sopt24.dshyun0226.androidseminar.Get

import org.sopt24.dshyun0226.androidseminar.Data.ProductOverviewData

data class GetMainProductListResponse(
    val status: Int,
    val success: Boolean,
    val message: String,
    val data: ArrayList<ProductOverviewData>
)