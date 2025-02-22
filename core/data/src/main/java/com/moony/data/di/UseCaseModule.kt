package com.moony.data.di

import com.moony.domain.repository.SeriesRepository
import com.moony.domain.usecase.GetSeriesUseCase
import com.moony.domain.usecase.GetSeriesUseCaseImpl
import com.moony.domain.usecase.GetVideoPageBySeriesUseCase
import com.moony.domain.usecase.GetVideoPageBySeriesUseCaseImpl
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Fake
    @Provides
    fun provideFakeGetSeriesUseCase(@Fake seriesRepository: SeriesRepository): GetSeriesUseCase {
        return GetSeriesUseCaseImpl(seriesRepository)
    }

    @Release
    @Provides
    fun provideReleaseGetSeriesUseCase(@Release seriesRepository: SeriesRepository): GetSeriesUseCase {
        return GetSeriesUseCaseImpl(seriesRepository)
    }

    @Fake
    @Provides
    fun providesFakeGetVideoPageBySeriesUseCase(@Fake seriesRepository: SeriesRepository): GetVideoPageBySeriesUseCase {
        return GetVideoPageBySeriesUseCaseImpl(seriesRepository)
    }

    @Release
    @Provides
    fun providesReleaseGetVideoPageBySeriesUseCase(@Release seriesRepository: SeriesRepository): GetVideoPageBySeriesUseCase {
        return GetVideoPageBySeriesUseCaseImpl(seriesRepository)
    }
}
