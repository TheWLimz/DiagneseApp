package com.diagnese.app.core.data.network.news

import com.diagnese.app.core.data.network.NetworkDataSource
import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.repository.INewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepository @Inject constructor(private val networkDataSource: NetworkDataSource) : INewsRepository {
    override suspend fun getAllNews(
        key: String,
        country: String,
        category: String,
    ): Flow<Resource<NewsResponse>> {
      return networkDataSource.getAllNews(key)
    }


}