package com.example.praktikumjobsheet1.api

import com.example.praktikumjobsheet1.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}