package com.diagnese.app.core.domain.repository

import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.network.disease.PredictResponse
import com.diagnese.app.core.data.network.disease.SymptomsResponse
import com.diagnese.app.core.data.state.Resource
import kotlinx.coroutines.flow.Flow
import org.json.JSONObject


interface IDiseaseRepository {

    suspend fun getAllDiseaseData() : Flow<Resource<DiseaseResponse>>

    suspend fun predictDisease(predictRequest: JSONObject) : Flow<Resource<PredictResponse>>

    suspend fun getSymptoms() : Flow<Resource<SymptomsResponse>>


}