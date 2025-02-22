package com.moony.domain.model

data class Video(
    val id: String,
    val title: String,
    val description: String,
    val url: String,
    val thumbnailUrl: String,
    val likeCount: Int,
    val archiveCount: Int
)
