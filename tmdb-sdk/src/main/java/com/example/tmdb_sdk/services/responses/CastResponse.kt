package com.example.tmdb_sdk.services.responses

import com.google.gson.annotations.SerializedName

data class CastResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("cast")
    val castResult: List<Cast>
){
    data class Cast(
        @SerializedName("known_for_department")
        val department: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("profile_path")
        val profilePath: String?
    )
}

