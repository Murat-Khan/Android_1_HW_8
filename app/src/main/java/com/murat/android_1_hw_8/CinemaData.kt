package com.murat.android_1_hw_8

import java.io.Serializable

data class CinemaData(
    val cinemaGenre:String?= null,
    var cinemaName:String?= null,
    var cinemaImage:String?= null
):Serializable
