package com.thit.onboarding.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.thit.onboarding.domain.usecase.SaveOnBoardingStateUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val saveOnBoardingStateUseCase: SaveOnBoardingStateUseCase
) : ViewModel() {

    fun saveOnBoardingState() {
        viewModelScope.launch {
            saveOnBoardingStateUseCase.invoke(isCompleted = true)
        }
    }
}