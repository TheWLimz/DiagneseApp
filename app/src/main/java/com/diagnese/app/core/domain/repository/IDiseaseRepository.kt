package com.diagnese.app.core.domain.repository

import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.state.Resource
import kotlinx.coroutines.flow.Flow


interface IDiseaseRepository {

    suspend fun getAllDiseaseData() : Flow<Resource<DiseaseResponse>>
}