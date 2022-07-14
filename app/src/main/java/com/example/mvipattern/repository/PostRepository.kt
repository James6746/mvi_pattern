package com.example.mvipattern.repository

import com.example.mvipattern.avtivity.main.helper.MainHelper

class PostRepository(private val mainHelper: MainHelper) {
    suspend fun allPosts() = mainHelper.allPosts()
    suspend fun deletePost(id: Int) = mainHelper.deletePost(id)
}