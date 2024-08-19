package com.example.dependencyinjectionexample.data.repository

import android.app.Application
import android.util.Log
import com.example.dependencyinjectionexample.data.remote.Authentication
import com.example.dependencyinjectionexample.domain.repository.Repository
import javax.inject.Inject

class RepositoryImp @Inject constructor
    (
    private val api: Authentication,
     private val appContext: Application
            ): Repository {

    override suspend fun login(requestBody: String) {
//        api.login(requestBody)
        Log.i("RepositoryImp", "login: hoye geche")
    }

}