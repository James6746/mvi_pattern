package com.example.mvipattern.avtivity.main.helper

import com.example.mvipattern.model.Post
import com.example.mvipattern.network.service.PostService

class MainHelperImpl(private val postService: PostService) : MainHelper {

    override suspend fun allPosts(): ArrayList<Post> {
        return postService.allPosts()
    }

    override suspend fun deletePost(id: Int): Post {
        return postService.deletePost(id)
    }
}