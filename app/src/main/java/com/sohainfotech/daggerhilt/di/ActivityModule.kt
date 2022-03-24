package com.meekoo.hilttutorial.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class ActivityModule {

    @Provides
    @ViewModelScoped
    fun provideRepositoryInt(): Int = 20
}