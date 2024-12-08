package com.thit.yawki.di

import com.thit.domain.repository.DataStoreRepository
import com.thit.domain.repository.UserRepository
import com.thit.domain.usecase.GetUserProfileImageUseCase
import com.thit.domain.usecase.GetUserUseCase
import com.thit.domain.usecase.UseCases
import com.thit.splash.repository.SplashAuthRepository
import com.thit.splash.usecase.IsSignedInUseCase
import com.thit.splash.usecase.ReadOnBoardingStateUseCase
import com.thit.splash.usecase.SplashUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
//    @Singleton
//    @Provides
//    fun provideSignUpUseCases(
//        authenticationRepository: AuthenticationRepository,
//        firebaseStorageRepository: FirebaseStorageRepository
//    ): SignUpUseCases {
//        return SignUpUseCases(
//            signUpWithEmailAndPasswordUseCase = SignUpWithEmailAndPasswordUseCase(
//                authRepository = authenticationRepository
//            ),
//            saveUserUseCase = SaveUserUseCase(
//                firebaseStorageRepository = firebaseStorageRepository,
//                authenticationRepository = authenticationRepository
//            ),
//        )
//    }

    @Provides
    @Singleton
    fun provideSplashUseCases(
        dataStoreRepository: DataStoreRepository,
        splashAuthRepository: SplashAuthRepository
    ): SplashUseCases {
        return SplashUseCases(
            isSignedInUseCase = IsSignedInUseCase(
                splashAuthRepository = splashAuthRepository
            ),
            readOnBoardingStateUseCase = ReadOnBoardingStateUseCase(
                dataStoreRepository = dataStoreRepository
            )
        )
    }
//
//    @Provides
//    @Singleton
//    fun provideHomeUseCases(
//        movieRepository: MovieRepository,
//    ): HomeUseCases {
//        return HomeUseCases(
//            getNowPlayingMovieUseCase = GetNowPlayingMovieUseCase(
//                movieRepository = movieRepository
//            ),
//            getPopularMovieUseCase = GetPopularMovieUseCase(
//                movieRepository = movieRepository
//            ),
//            getTopRatedMovieUseCase = GetTopRatedMovieUseCase(
//                movieRepository = movieRepository
//            )
//        )
//    }
//
//    @Provides
//    @Singleton
//    fun provideDetailUseCases(
//        detailMovieRepository: DetailMovieRepository,
//        firebaseRepository: FirebaseRepository
//    ): com.kursatkumsuz.detail.domain.usecase.DetailUseCases {
//        return com.kursatkumsuz.detail.domain.usecase.DetailUseCases(
//            getCastUseCase = com.kursatkumsuz.detail.domain.usecase.GetCastUseCase(detailMovieRepository = detailMovieRepository),
//            getMovieDetailUseCase = com.kursatkumsuz.detail.domain.usecase.GetMovieDetailUseCase(
//                detailMovieRepository = detailMovieRepository
//            ),
//            saveMovieToWatchlistUseCase = com.kursatkumsuz.detail.domain.usecase.SaveMovieToWatchlistUseCase(
//                firebaseRepository = firebaseRepository
//            )
//        )
//    }
//
//    @Provides
//    @Singleton
//    fun provideProfileUseCases(
//        imageRepository: ImageRepository,
//        profileAuthenticationRepository: ProfileAuthenticationRepository
//    ): com.kursatkumsuz.profile.domain.usecase.ProfileUseCases {
//        return com.kursatkumsuz.profile.domain.usecase.ProfileUseCases(
//            uploadProfileImageUseCase = com.kursatkumsuz.profile.domain.usecase.UploadProfileImageUseCase(
//                imageRepository = imageRepository
//            ),
//            saveUserProfileImageUseCase = com.kursatkumsuz.profile.domain.usecase.SaveUserProfileImageUseCase(
//                imageRepository = imageRepository
//            ),
//            signOutUseCase = com.kursatkumsuz.profile.domain.usecase.SignOutUseCase(
//                authenticationRepository = profileAuthenticationRepository
//            )
//        )
//    }
//
//    @Singleton
//    @Provides
//    fun provideWatchListUseCases(watchListRepository: WatchListRepository): WatchListUseCases {
//        return WatchListUseCases(
//            deleteWatchListUseCase = DeleteWatchListUseCase(
//                watchListRepository = watchListRepository
//            ),
//            getWatchListUseCase = GetWatchListUseCase(
//                watchListRepository = watchListRepository
//            )
//        )
//    }

    @Provides
    @Singleton
    fun provideUseCase(
        userRepository: UserRepository,
    ): UseCases {
        return UseCases(
            getUserUseCase = GetUserUseCase(userRepository = userRepository),
            getUserProfileImageUseCase = GetUserProfileImageUseCase(userRepository = userRepository),
        )
    }
}

