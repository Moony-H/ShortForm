package com.moony.data

import com.moony.domain.model.Series
import com.moony.domain.model.Video

object DummyGenerator {
    private val videoUrlList = listOf(
        "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4",
        "https://github.com/user-attachments/assets/fc07f39e-7f09-4acb-a904-486066d3f7aa",
        "https://github.com/user-attachments/assets/22a2d5af-4125-4714-b5d2-bbf71c6213e2"
    )

    private val imageUrlList = listOf(
        "https://github.com/user-attachments/assets/ae0cd354-6422-4cd4-a978-8fce65c7eb56",
        "https://github.com/user-attachments/assets/176428e3-1027-45d8-a28a-1ae6d0b4d952",
        "https://github.com/user-attachments/assets/fc421ca6-4fd8-4dc0-9b1f-4930e1d6287f",
    )

    private val seriesNameList = listOf(
        "문휘의 자연 암벽 타기",
        "매우매우 긴 텍스트를 실험하는 타이틀입니다. 매우매우 긴 텍스트를 실험하는 타이틀입니다. 매우매우 긴 텍스트를 실험하는 타이틀입니다. 매우매우 긴 텍스트를 실험하는 타이틀입니다.",
        "달 그린 기린 그림",
        "열혈 c++"
    )

    private fun getRandomVideo() = Video(
        id = (0..10000).random().toString(),
        title = seriesNameList.random(),
        description = "description",
        url = videoUrlList.random(),
        thumbnailUrl = imageUrlList.random(),
        likeCount = (0..100).random(),
        archiveCount = (0..100).random()
    )

    private fun getRandomSeries() = Series(
        id = (0..10000).random(),
        title = seriesNameList.random(),
        thumbnailUrl = imageUrlList.random()
    )

    fun getRandomVideoList(size: Int): List<Video> {
        return List(size) { getRandomVideo() }
    }

    fun getRandomSeriesList(size: Int): List<Series> {
        return List(size) { getRandomSeries() }
    }


}
