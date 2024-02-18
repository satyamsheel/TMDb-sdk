package com.example.tmdb_sdk.services.responses

import com.example.tmdb_sdk.services.responses.FilmResponse
import com.google.gson.annotations.SerializedName

data class GenreResponse(
    @SerializedName("genres")
    val genres: List<FilmResponse.Genre>
)