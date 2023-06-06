package com.diagnese.app.pages.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diagnese.app.BuildConfig
import com.diagnese.app.core.data.network.news.NewsResponse
import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.usecase.news.NewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val newsUseCase: NewsUseCase) : ViewModel() {

    init {
        getAllNews(BuildConfig.API_KEY)
    }


    private val _newsPagingData = MutableLiveData<Resource<NewsResponse>>()
    val newsPagingData : LiveData<Resource<NewsResponse>> = _newsPagingData


   fun getAllNews(key : String) = viewModelScope.launch {
        newsUseCase.getAllNews(key).collect{ response ->
            _newsPagingData.value = response
        }
    }
}