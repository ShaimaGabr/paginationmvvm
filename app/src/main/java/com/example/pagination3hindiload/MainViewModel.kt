package com.example.pagination3hindiload

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.pagination3hindiload.api.ApiService
import com.example.pagination3hindiload.data.Dogs
import com.example.pagination3hindiload.repositry.DogsPageSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(private val apiService: ApiService) : ViewModel()
{
    val getAllDogs: Flow<PagingData<Dogs>> = Pager(config = PagingConfig(2,enablePlaceholders = false)){
        DogsPageSource(apiService)
    }.flow.cachedIn(viewModelScope)


}