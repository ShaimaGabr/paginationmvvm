package com.example.pagination3hindiload.data

import com.squareup.moshi.Json

data class Dogs(
    @Json(name = "breeds")
    val breeds:List<Breeds>?,
    @Json(name= "url")
    val url:String?
)

data class Breeds(
    @Json(name="id")
    val id:Int?,
    @Json(name="name")
    val name:String?
)