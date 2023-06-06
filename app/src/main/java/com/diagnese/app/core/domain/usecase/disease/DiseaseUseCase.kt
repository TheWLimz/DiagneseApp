package com.diagnese.app.core.domain.usecase.disease

import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.state.Resource
import kotlinx.coroutines.flow.Flow


interface DiseaseUseCase {

  suspend fun getAllDiseaseData() : Flow<Resource<DiseaseResponse>>
}