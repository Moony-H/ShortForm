package com.moony.domain.repository

import com.moony.domain.model.Series
import com.moony.domain.model.Video

interface SeriesRepository {
    suspend fun getVideoPageBySeries(series: Series, page: Int, pageAmount: Int): List<Video>
    suspend fun getSeries(): List<Series>
}
