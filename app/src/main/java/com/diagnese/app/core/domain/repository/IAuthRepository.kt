package com.diagnese.app.core.domain.repository

import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.data.User
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface IAuthRepository {

    val firebaseUser : FirebaseUser?

    suspend fun login(email : String, password : String) : Resource<FirebaseUser>

    suspend fun register(email : String, password: String, user: User) : Resource<FirebaseUser>

    fun logout()
}