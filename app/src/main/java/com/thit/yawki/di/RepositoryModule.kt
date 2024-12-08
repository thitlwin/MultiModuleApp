package com.thit.yawki.di

import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.thit.data.repository.DataStoreRepositoryImpl
import com.thit.data.repository.UserRepositoryImpl
import com.thit.domain.repository.DataStoreRepository
import com.thit.domain.repository.UserRepository
import com.thit.home.data.remote.ApiService
import com.thit.home.data.repository.MovieRepositoryImpl
import com.thit.home.domain.repository.MovieRepository
import com.thit.signin.domain.repository.AuthenticationRepository
import com.thit.signin.repository.AuthenticationRepositoryImpl
import com.thit.signup.domain.repository.FirebaseStorageRepository
import com.thit.signup.domain.repository.SignUpAuthenticationRepository
import com.thit.signup.repository.FirebaseStorageRepositoryImpl
import com.thit.signup.repository.SignUpAuthenticationRepositoryImpl
import com.thit.splash.repository.SplashAuthRepository
import com.thit.splash.repository.SplashAuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideSignInAuthenticationRepository(firebaseAuth: FirebaseAuth):  AuthenticationRepository {
        return AuthenticationRepositoryImpl(
            firebaseAuth = firebaseAuth
        )
    }

    @Provides
    @Singleton
    fun provideSplashAuthRepository(firebaseAuth: FirebaseAuth): SplashAuthRepository {
        return SplashAuthRepositoryImpl(firebaseAuth = firebaseAuth)
    }

    @Provides
    @Singleton
    fun provideDataStoreRepository(@ApplicationContext context: Context): DataStoreRepository {
        return DataStoreRepositoryImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideSignUpAuthenticationRepository(firebaseAuth: FirebaseAuth): SignUpAuthenticationRepository {
        return SignUpAuthenticationRepositoryImpl(firebaseAuth = firebaseAuth)
    }

//    @Provides
//    @Singleton
//    fun provideProfileAuthenticationRepository(firebaseAuth: FirebaseAuth): ProfileAuthenticationRepository {
//        return ProfileAuthenticationRepositoryImpl(firebaseAuth = firebaseAuth)
//    }
//
//    @Provides
//    @Singleton
//    fun provideImageRepository(
//        firebaseAuth: FirebaseAuth,
//        firebaseFirestore: FirebaseFirestore,
//        firebaseStorage: FirebaseStorage
//    ): ImageRepository {
//        return ImageRepositoryImpl(
//            firebaseAuth = firebaseAuth,
//            firebaseFirestore = firebaseFirestore,
//            firebaseStorage = firebaseStorage
//        )
//    }
//
    @Provides
    @Singleton
    fun provideMovieRepository(apiService: ApiService): MovieRepository {
        return MovieRepositoryImpl(apiService = apiService)
    }

//    @Provides
//    @Singleton
//    fun provideWatchListRepository(
//        firebaseFirestore: FirebaseFirestore,
//        firebaseAuth: FirebaseAuth
//    ): com.kursatkumsuz.watchlist.domain.repository.WatchListRepository {
//        return WatchListRepositoryImpl(
//            firebaseFirestore = firebaseFirestore,
//            firebaseAuth = firebaseAuth
//        )
//    }
//
//    @Provides
//    @Singleton
//    fun provideVideoRepository(videoApiService: VideoApiService): com.kursatkumsuz.video.domain.repository.VideoRepository {
//        return VideoRepositoryImpl(videoApiService = videoApiService)
//    }
//
//    @Provides
//    @Singleton
//    fun provideSearchRepository(searchApiService: com.kursatkumsuz.search.data.remote.SearchApiService): com.kursatkumsuz.search.domain.repository.SearchRepository {
//        return com.kursatkumsuz.search.data.repository.SearchRepositoryImpl(searchApiService = searchApiService)
//    }
//
    @Provides
    @Singleton
    fun provideFirebaseStorageRepository(
    firebaseFirestore: FirebaseFirestore,
    ): FirebaseStorageRepository {
        return FirebaseStorageRepositoryImpl(
            firebaseFirestore = firebaseFirestore,
        )
    }

    @Provides
    @Singleton
    fun provideUserRepository(
        firebaseFirestore: FirebaseFirestore,
        firebaseAuth: FirebaseAuth
    ): UserRepository {
        return UserRepositoryImpl(
            firebaseFirestore = firebaseFirestore,
            firebaseAuth = firebaseAuth
        )
    }

//    @Provides
//    @Singleton
//    fun provideFirebaseRepository(
//        firebaseFirestore: FirebaseFirestore,
//        firebaseAuth: FirebaseAuth
//    ): com.kursatkumsuz.detail.domain.repository.FirebaseRepository {
//        return com.kursatkumsuz.detail.data.repository.FirebaseRepositoryImpl(
//            firebaseFirestore = firebaseFirestore,
//            firebaseAuth = firebaseAuth
//        )
//    }
//
//    @Provides
//    @Singleton
//    fun provideDetailMovieRepository(detailApiService: com.kursatkumsuz.detail.data.remote.DetailApiService): com.kursatkumsuz.detail.domain.repository.DetailMovieRepository {
//        return com.kursatkumsuz.detail.data.repository.DetailMovieRepositoryImpl(detailApiService = detailApiService)
//    }

}