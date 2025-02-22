package com.moony.data

import com.moony.domain.model.Series
import com.moony.domain.model.Video
import com.moony.domain.repository.SeriesRepository

class SeriesRepositoryFake() : SeriesRepository {
    override suspend fun getVideoPageBySeries(
        series: Series,
        page: Int,
        pageAmount: Int
    ): List<Video> {
        return DummyGenerator.getRandomVideoList(pageAmount)
    }

    override suspend fun getSeries(): List<Series> {
        return DummyGenerator.getRandomSeriesList(10)
    }
}


//실제 서버가 있고, 개발하게 된다면?
class SeriesRepositoryImpl() : SeriesRepository {
    override suspend fun getSeries(): List<Series> {
        return listOf()
    }

    override suspend fun getVideoPageBySeries(
        series: Series,
        page: Int,
        pageAmount: Int
    ): List<Video> {
        return listOf()
    }
}
