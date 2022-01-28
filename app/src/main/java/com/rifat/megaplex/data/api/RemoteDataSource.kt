package com.rifat.megaplex.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RemoteDataSource {
    companion object {
        private const val BASE_URL = "https://fakestoreapi.com/"
    }

    fun <Api> buildApi (
        api: Class<Api>
    ) : Api {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}