package com.diagnese.app.core.data.network.disease

import retrofit2.http.GET

interface DiseaseApiService {

    @GET("glosarium")
    suspend fun getAllDiseaseData() : DiseaseResponse


}