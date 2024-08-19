package com.example.dependencyinjectionexample

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionexample.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    init {
        Log.i( "ViewModel", "ViewModel: hoye geche");
    }
}