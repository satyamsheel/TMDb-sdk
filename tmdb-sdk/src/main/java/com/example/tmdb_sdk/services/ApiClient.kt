package com.example.tmdb_sdk.services

import com.example.tmdb_sdk.configuration.TMDbKey
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private val authInterceptor = Interceptor {chain->
        val newUrl = chain.request().url
            .newBuilder()
            .addQueryParameter("api_key", TMDbKey.instance.getConfiguration().getApiKey())
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        chain.proceed(newRequest)
    }

    private val tmdbClient = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    val publicApi =  Retrofit.Builder()
        .client(tmdbClient)
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(APi::class.java)
}