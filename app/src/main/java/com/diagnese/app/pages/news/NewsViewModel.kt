package com.diagnese.app.pages.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diagnese.app.core.data.network.news.NewsResponse
import com.diagnese.app.core.domain.usecase.news.NewsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsUseCase: NewsUseCase) : ViewModel() {

    private val _newsData = MutableLiveData<NewsResponse>()
    val newsData : LiveData<NewsResponse> = _newsData

    init {
        getAllNews("0b0c21a383e04e20bc28a3003c51bc12")
    }


    fun getAllNews(key : String) = viewModelScope.launch {
        newsUseCase.getAllNews(key).collect{ response ->
            _newsData.postValue(response.data!!)
        }
    }
}