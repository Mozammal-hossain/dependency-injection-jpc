package com.example.dependencyinjectionexample.domain.repository

interface Repository {
    suspend fun login(requestBody: String)
}