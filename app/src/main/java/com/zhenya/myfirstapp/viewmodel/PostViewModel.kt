package com.zhenya.myfirstapp.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.zhenya.myfirstapp.dto.Post
import com.zhenya.myfirstapp.repository.PostRepository
import com.zhenya.myfirstapp.repository.PostRepositoryInMemoryImpl

class PostViewModel : ViewModel() {

    private val repository: PostRepository = PostRepositoryInMemoryImpl()

    val data: LiveData<List<Post>> = repository.getAll()

    fun likeById(id: Long) = repository.likeById(id)

    fun shareById(id: Long) = repository.shareById(id)

    fun increaseViews(id: Long) = repository.increaseViews(id)
}

