package com.diagnese.app.core.domain.usecase.disease

import com.diagnese.app.core.data.network.disease.DiseaseItem
import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.network.disease.PredictResponse
import com.diagnese.app.core.data.network.disease.SymptomsResponse
import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.repository.IDiseaseRepository
import kotlinx.coroutines.flow.Flow
import org.json.JSONObject
import javax.inject.Inject

class DiseaseInteractor @Inject constructor(private val diseaseRepository: IDiseaseRepository): DiseaseUseCase {

    override suspend fun getAllDiseaseData(): Flow<Resource<DiseaseResponse>> {
        return diseaseRepository.getAllDiseaseData()
    }

    override suspend fun predictDisease(predictData: JSONObject): Flow<Resource<PredictResponse>> {
        return diseaseRepository.predictDisease(predictData)
    }

    override suspend fun getSymptoms(): Flow<Resource<SymptomsResponse>> {
        return diseaseRepository.getSymptoms()
    }



}