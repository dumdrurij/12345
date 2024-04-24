package com.example.picasso.ui.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("breed/hound/images")
    fun getDogPicturesList(): Call<DogPictures>
}