package com.example.dependencyinjectionexample.di

import com.example.dependencyinjectionexample.data.repository.RepositoryImp
import com.example.dependencyinjectionexample.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: RepositoryImp
    ): Repository

}