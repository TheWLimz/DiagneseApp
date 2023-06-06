package com.diagnese.app.core.data.network

import com.diagnese.app.core.data.network.disease.DiseaseApiService
import com.diagnese.app.core.data.network.disease.DiseaseResponse
import com.diagnese.app.core.data.network.news.NewsApiService
import com.diagnese.app.core.data.network.news.NewsResponse
import com.diagnese.app.core.data.state.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkDataSource @Inject constructor(
    private val newsApiService: NewsApiService,
    private val diseaseApiService: DiseaseApiService
    )  {

    suspend fun getAllNews(
        key : String,
        country : String = "id",
       category: String = "health"
    ) : Flow<Resource<NewsResponse>>{
        return flow {
            try {
                val response = newsApiService.getAllNews(key,country,category)
                val newsList = response.articles
                if(newsList.isNotEmpty()){
                    emit(Resource.Success(response))
                } else{
                    emit(Resource.Error(response.status!!))
                }

            } catch (e : Exception){
                emit(Resource.Error(e.toString()))
            }

        }.flowOn(Dispatchers.IO)
    }

    suspend fun getAllDiseaseData() : Flow<Resource<DiseaseResponse>>{
        return flow {
            try {
                emit(Resource.Loading())
                val response = diseaseApiService.getAllDiseaseData()
                if (response.code == 200){
                    emit(Resource.Success(response))
                } else{
                    emit(Resource.Error(response.message))
                }
            } catch (e : Exception){
                emit(Resource.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}