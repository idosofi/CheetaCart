package com.sofiwares.cheetacart.data.json
import retrofit2.http.GET

/**
 * Created by Ido Sofi on 11/27/2017.
 */
interface APIService {
    @GET("v2/59c791ed1100005300c39b93")
    fun getCart()
}