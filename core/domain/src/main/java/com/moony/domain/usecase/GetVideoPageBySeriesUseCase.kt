package com.moony.domain.usecase

import com.moony.domain.model.Series
import com.moony.domain.model.Video
import com.moony.domain.repository.SeriesRepository

interface GetVideoPageBySeriesUseCase {
    suspend operator fun invoke(series: Series, page: Int, pageAmount: Int): List<Video>
}

class GetVideoPageBySeriesUseCaseImpl(
    private val seriesRepository: SeriesRepository
) : GetVideoPageBySeriesUseCase {
    override suspend operator fun invoke(series: Series, page: Int, pageAmount: Int): List<Video> {
        return seriesRepository.getVideoPageBySeries(series, page, pageAmount)
    }
}

