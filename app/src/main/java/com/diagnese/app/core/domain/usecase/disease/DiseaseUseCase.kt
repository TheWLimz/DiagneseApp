package com.diagnese.app.core.domain.usecase.disease

import com.diagnese.app.core.data.network.disease.DiseaseItem
import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.network.disease.PredictResponse
import com.diagnese.app.core.data.network.disease.SymptomsResponse
import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.data.Disease
import kotlinx.coroutines.flow.Flow
import org.json.JSONObject


interface DiseaseUseCase {

  suspend fun getAllDiseaseData() : Flow<Resource<DiseaseResponse>>

  suspend fun predictDisease(predictData : JSONObject) : Flow<Resource<PredictResponse>>

  suspend fun getSymptoms() : Flow<Resource<SymptomsResponse>>


}