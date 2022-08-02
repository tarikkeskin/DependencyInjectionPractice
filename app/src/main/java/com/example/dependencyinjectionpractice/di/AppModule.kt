package com.example.dependencyinjectionpractice.di

import com.example.dependencyinjectionpractice.repo.DogsRepository
import com.example.dependencyinjectionpractice.repo.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideDogsRepository(): DogsRepository = DogsRepositoryImpl()

}