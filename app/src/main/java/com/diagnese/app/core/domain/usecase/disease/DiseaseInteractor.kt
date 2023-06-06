package com.diagnese.app.core.domain.usecase.disease

import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.repository.IDiseaseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DiseaseInteractor @Inject constructor(private val diseaseRepository: IDiseaseRepository): DiseaseUseCase {

    override suspend fun getAllDiseaseData(): Flow<Resource<DiseaseResponse>> {
        return diseaseRepository.getAllDiseaseData()
    }

}