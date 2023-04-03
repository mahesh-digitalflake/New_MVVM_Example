package com.example.newmvvmexample.data.api

import com.example.newmvvmexample.model.Post
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PostService {
    private val BASE_URL="https://jsonplaceholder.typicode.com/"

    private val api=Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(PostApi::class.java)

    fun getPosts():Single<List<Post>>{
        return api.getPosts()
    }
}