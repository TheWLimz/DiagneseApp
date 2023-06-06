package com.diagnese.app.pages.glosary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.domain.usecase.disease.DiseaseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GlosaryViewModel @Inject constructor(private val diseaseUseCase: DiseaseUseCase): ViewModel() {

    private var _diseaseData = MutableLiveData<DiseaseResponse?>()
    val diseaseData : LiveData<DiseaseResponse?> = _diseaseData

    init {
        getAllDiseaseData()
    }

    private fun getAllDiseaseData() =
        viewModelScope.launch {
            diseaseUseCase.getAllDiseaseData().collect{
                _diseaseData.value = it.data
            }
        }


}