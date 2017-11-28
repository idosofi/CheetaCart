package com.sofiwares.cheetacart.data.json

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by idosofi on 28/11/2017.
 */
interface CartAPI {
    @GET("/v2/59c791ed1100005300c39b93")
    fun getCart(): Call<CartResponse>
}