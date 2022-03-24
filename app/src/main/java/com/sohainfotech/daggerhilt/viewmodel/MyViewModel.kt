package com.sohainfotech.daggerhilt.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val intValue: Int) : ViewModel() {
    val TAG = "MyViewModel"

    init {
        Log.d(TAG, "debug: ViewModelValue: $intValue")
    }
}
