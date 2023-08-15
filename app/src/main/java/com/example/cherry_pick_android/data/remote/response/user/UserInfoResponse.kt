package com.example.cherry_pick_android.data.remote.response.user


import com.squareup.moshi.Json

data class UserInfoResponse(
    @field:Json(name = "birthdate")
    val birthdate: String?,
    @field:Json(name = "gender")
    val gender: String?,
    @field:Json(name = "industryKeyword1")
    val industryKeyword1: String?,
    @field:Json(name = "industryKeyword2")
    val industryKeyword2: String?,
    @field:Json(name = "industryKeyword3")
    val industryKeyword3: String?,
    @field:Json(name = "memberImgUrl")
    val memberImgUrl: String?,
    @field:Json(name = "memberNumber")
    val memberNumber: String?,
    @field:Json(name = "name")
    val name: String?
)