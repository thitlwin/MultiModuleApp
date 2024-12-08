package com.thit.home.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.thit.home.data.model.Result
import com.thit.home.data.datasource.MovieDataSource
import com.thit.home.data.remote.ApiService
import com.thit.home.domain.repository.MovieRepository
import com.thit.home.util.MovieType
import kotlinx.coroutines.flow.Flow

class MovieRepositoryImpl(private val apiService: ApiService) : MovieRepository {
    override fun getTopRatedMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 3,
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.TOP_RATED
                )
            },
        ).flow
    }

    override fun getPopularMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 3,
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.POPULAR
                )
            },
        ).flow
    }

    override fun getNowPlayingMovies(): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(
                pageSize = 1
            ),
            pagingSourceFactory = {
                MovieDataSource(
                    apiService = apiService,
                    movieType = MovieType.NOW_PLAYING
                )
            }
        ).flow
    }
}
