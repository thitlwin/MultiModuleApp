package com.thit.yawki.di

import android.content.Context
import com.thit.home.data.remote.ApiService
import com.thit.yawki.util.NetworkCacheInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import javax.inject.Singleton

private const val BASE_URL = "https://api.themoviedb.org/3/"

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideCacheInterceptor() = NetworkCacheInterceptor()

    @Singleton
    @Provides
    fun provideOkHttp(
        @ApplicationContext context: Context,
        cacheInterceptor: NetworkCacheInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .cache(Cache(File(context.cacheDir, "http-cache"), 10L * 1024L * 1024L))
            .addNetworkInterceptor(cacheInterceptor)
            .build()
    }

//    @Singleton
//    @Provides
//    fun provideVideoApiService(retrofit: Retrofit): VideoApiService =
//        retrofit.create(VideoApiService::class.java)
//
//    @Singleton
//    @Provides
//    fun provideDetailApiService(retrofit: Retrofit): DetailApiService =
//        retrofit.create(DetailApiService::class.java)
//
//    @Singleton
//    @Provides
//    fun provideSearchApiService(retrofit: Retrofit): SearchApiService =
//        retrofit.create(SearchApiService::class.java)

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}