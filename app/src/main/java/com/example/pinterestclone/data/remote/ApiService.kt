package com.example.pinterestclone.data.remote


import com.example.pinterestclone.model.Home
import com.example.pinterestclone.model.HomeItem

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos")
    fun listPhotos1(
        @Query("page")page:Int=2,
        @Query("client_id") client_id:String="rSqXKqR6TpdYIhRIFdFEo913HU7_1tUSnnblDIXwE9E",
    ): Call<ArrayList<HomeItem>>

}