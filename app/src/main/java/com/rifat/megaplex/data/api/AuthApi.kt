package com.rifat.megaplex.data.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApi {

    @FormUrlEncoded
    @POST
    fun login (
        @Field("") email: String,
        @Field("") password: String
    ) : Any
}