package com.diagnese.app.core.domain.usecase.firebase

import com.diagnese.app.core.data.state.Resource
import com.diagnese.app.core.domain.data.User
import com.diagnese.app.core.domain.repository.IAuthRepository
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class FirebaseInteractor @Inject constructor(private val firebaseRepository: IAuthRepository) : FirebaseUseCase {

    override val firebaseUser: FirebaseUser?
        get() = firebaseRepository.firebaseUser

    override suspend fun login(email: String, password: String): Resource<FirebaseUser> {
        return firebaseRepository.login(email, password)
    }

    override suspend fun register(
        email: String,
        password: String,
        user: User
    ): Resource<FirebaseUser> {
        return firebaseRepository.register(email, password, user)
    }

    override fun logout() {
       firebaseRepository.logout()
    }


}