package com.example.dependencyinjectionexample.di

import com.example.dependencyinjectionexample.data.remote.Authentication
import com.example.dependencyinjectionexample.data.repository.RepositoryImp
import com.example.dependencyinjectionexample.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
   @Provides
    @Singleton
    fun provideMyApi(): Authentication {
        return Retrofit.Builder()
            .baseUrl("http://34.72.136.54:4067/api/v1/auth/")
            .build()
            .create(Authentication::class.java)
    }

}
