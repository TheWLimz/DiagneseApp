package com.diagnese.app.core.domain.repository

import com.diagnese.app.core.data.network.news.NewsResponse
import com.diagnese.app.core.data.state.Resource
import kotlinx.coroutines.flow.Flow

interface INewsRepository {

    suspend fun getAllNews(
        key : String ,
        country : String = "id",
        category: String = "health",
    ) : Flow<Resource<NewsResponse>>

}