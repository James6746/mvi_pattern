package com.example.mvipattern.avtivity.main.helper

import com.example.mvipattern.model.Post

interface MainHelper {
    suspend fun allPosts(): ArrayList<Post>
    suspend fun deletePost(id: Int): Post
}