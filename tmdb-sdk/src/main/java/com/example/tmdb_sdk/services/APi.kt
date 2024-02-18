package com.example.tmdb_sdk.services

import com.example.tmdb_sdk.services.responses.CastResponse
import com.example.tmdb_sdk.services.responses.FilmResponse
import com.example.tmdb_sdk.services.responses.GenreResponse
import com.example.tmdb_sdk.services.responses.MultiSearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APi {

    @GET("trending/movie/day")
    suspend fun getTrendingMovies(@Query("page") page: Int = 0, ): FilmResponse

    @GET("movie/popular")
    suspend fun getPopularMovie(@Query("page") page : Int = 0): FilmResponse

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("page") page: Int = 0, ): FilmResponse

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(@Query("page") page: Int = 0, ): FilmResponse

    @GET("movie/{movie_id}/similar")
    suspend fun getSimilarMovies(@Path("movie_id") filmId: Int, @Query("page") page: Int = 0, ): FilmResponse

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query("page") page: Int = 0, ): FilmResponse

    @GET("movie/{movie_id}/credits")
    suspend fun getMovieCast(@Path("movie_id") filmId: Int, ): CastResponse

    @GET("genre/movie/list")
    suspend fun getMovieGenres(): GenreResponse

    @GET("search/multi")
    suspend fun multiSearch(
        @Query("query") searchParams: String,
        @Query("page") page: Int = 0,
        @Query("include_adult") includeAdult: Boolean = true,
    ): MultiSearchResponse

}