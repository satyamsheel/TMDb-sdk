package com.example.tmdb_sdk.configuration

import android.content.Context

open class TMDbKey {
    companion object {
        val instance : TMDbKey by lazy { TMDbKey() }
    }
    private lateinit var configuration: ApiKeyConfiguration

    fun init(context: Context, configuration: ApiKeyConfiguration){
        instance.configuration = configuration
    }
    fun getConfiguration() : ApiKeyConfiguration = configuration
}