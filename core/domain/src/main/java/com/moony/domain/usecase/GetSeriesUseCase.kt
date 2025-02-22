package com.moony.domain.usecase

import com.moony.domain.model.Series
import com.moony.domain.repository.SeriesRepository

interface GetSeriesUseCase {
    suspend operator fun invoke(): List<Series>
}

class GetSeriesUseCaseImpl(
    private val seriesRepository: SeriesRepository
) : GetSeriesUseCase {
    override suspend operator fun invoke(): List<Series> {
        return seriesRepository.getSeries()
    }
}
