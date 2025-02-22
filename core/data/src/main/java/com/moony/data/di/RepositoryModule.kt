package com.moony.data.di

import com.moony.data.SeriesRepositoryFake
import com.moony.data.SeriesRepositoryImpl
import com.moony.domain.repository.SeriesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Fake
    @Binds
    @Singleton
    abstract fun provideSeriesRepository(seriesRepositoryFake: SeriesRepositoryFake): SeriesRepository

    @Release
    @Binds
    @Singleton
    abstract fun provideSeriesRepositoryImpl(seriesRepositoryImpl: SeriesRepositoryImpl): SeriesRepository
}
