package com.thit.home.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import com.thit.home.data.model.Result


interface MovieRepository {

     fun getTopRatedMovies() : Flow<PagingData<Result>>

     fun getPopularMovies() : Flow<PagingData<Result>>

     fun getNowPlayingMovies() : Flow<PagingData<Result>>
}