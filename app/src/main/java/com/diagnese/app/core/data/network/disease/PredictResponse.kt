package com.diagnese.app.core.data.network.disease

import com.google.gson.annotations.SerializedName

data class PredictResponse(

	@field:SerializedName("code")
	val code: Int,

	@field:SerializedName("data")
	val data: PredictData,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class PredictData(

	@field:SerializedName("spesialis")
	val spesialis: String,

	@field:SerializedName("deskripsi")
	val deskripsi: String,

	@field:SerializedName("prognosis")
	val prognosis: String
)
