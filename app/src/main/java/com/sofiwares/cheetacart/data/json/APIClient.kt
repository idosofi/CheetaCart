package com.sofiwares.cheetacart.data.json

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Ido Sofi on 11/27/2017.
 */

const val ROOT_URL: String = "http://www.mocky.io"

class APIClient {

    companion object {
        val retrofit: Retrofit? = null
        fun getClient(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl(ROOT_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
    }
}