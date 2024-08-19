package com.example.dependencyinjectionexample.data.remote

import retrofit2.http.GET

interface Authentication {
    @GET("login")
    suspend fun login(requestBody: String)
}