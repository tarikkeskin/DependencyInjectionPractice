package com.example.dependencyinjectionpractice.di

import com.example.dependencyinjectionpractice.repo.DogsRepository
import com.example.dependencyinjectionpractice.repo.DogsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Module as you might guess, marks this class as a module,
 * aka a class that provides dependencies to other classes within its component’s scope.

 * @InstallIn defines the component the module is allowed to provide dependencies to.
 * SingletonComponent is a top-level component that allows the module to inject dependencies across the entire application.
 *
 */
@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    /**
     * Now in AppModule, add the provision for DogsRepository using the @Provides annotation.
     * We’re using the @Singleton annotation so we only ever inject the same one instance of DogsRepository anywhere it’s requested.
     * Use this only when needed.
     */
    @Provides
    @Singleton
    fun provideDogsRepository(): DogsRepository = DogsRepositoryImpl()

}