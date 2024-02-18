package com.example.tmdb_sdk.configuration

class ApiKeyConfiguration {
    private lateinit var apiKey: String

    fun setApiKey(apiKey: String) {
        this.apiKey = apiKey
    }

    fun getApiKey(): String = apiKey
}