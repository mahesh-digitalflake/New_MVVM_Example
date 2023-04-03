package com.example.newmvvmexample.data.api

import com.example.newmvvmexample.model.Post
import io.reactivex.Single
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    fun getPosts():Single<List<Post>>
}