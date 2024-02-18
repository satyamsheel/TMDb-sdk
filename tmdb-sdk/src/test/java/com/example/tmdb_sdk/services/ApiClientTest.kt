package com.example.tmdb_sdk.services

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class ApiClientTest  {

    @Test
    fun `GET genre`() {
        runBlocking {
            val genre = ApiClient.publicApi.getMovieGenres()
            Assert.assertNotNull(genre.genres)
        }
    }

    @Test
    fun `GET cast`() {
        runBlocking {
            val cast = ApiClient.publicApi.getMovieCast(933131)
            Assert.assertNotNull(cast.castResult)
        }
    }


    @Test
    fun `GET popularMovie`() {
        runBlocking {
            val popular = ApiClient.publicApi.getPopularMovie(1)
            Assert.assertNotNull(popular.results)
        }
    }

    @Test
    fun `GET trendingMovie`() {
        runBlocking {
            val popular = ApiClient.publicApi.getTrendingMovies(1)
            Assert.assertNotNull(popular.results)
        }
    }

    @Test
    fun `GET topRatedMovie`() {
        runBlocking {
            val popular = ApiClient.publicApi.getTopRatedMovies(1)
            Assert.assertNotNull(popular.results)
        }
    }

    @Test
    fun `GET nowPlaying`() {
        runBlocking {
            val popular = ApiClient.publicApi.getNowPlayingMovies(1)
            Assert.assertNotNull(popular.results)
        }
    }


    @Test
    fun `GET searchResult`() {
        runBlocking {
            val searchResult = ApiClient.publicApi.multiSearch("titanic",1)
            Assert.assertNotNull(searchResult.results)
        }
    }

    @Test
    fun `GET upcoming`() {
        runBlocking {
            val searchResult = ApiClient.publicApi.getUpcomingMovies(1)
            Assert.assertNotNull(searchResult.results)
        }
    }
}