package com.rifat.megaplex.data.api

import okhttp3.ResponseBody

sealed class Resource <out T> {

    data class Success<out T>(val value: T) : Resource<T> ()

    data class failure (
        val isNetworkEror: Boolean,
        val errorCode: Int?,
        val errorBody: ResponseBody?

    )
}