package com.example.myroomsatu.view.viewmodel.provider

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.repositori.ContainerDataApp
import com.example.myroomsatu.view.viewmodel.DetailViewModel
import com.example.myroomsatu.view.viewmodel.EditViewModel
import com.example.myroomsatu.view.viewmodel.HomeViewModel
import com.example.myroomsatu.viewmodel.EntryViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            val appContext = aplikasiContext() // dapatkan context dari CreationExtras
            val container = ContainerDataApp(appContext) // buat container
            HomeViewModel(repositoriSiswa = container.repositoriSiswa)
        }
        initializer {
            val appContext = aplikasiContext()
            val container = ContainerDataApp(appContext)
            EntryViewModel(repositoriSiswa = container.repositoriSiswa)
        }
        initializer {
            val appContext = aplikasiContext()
            val container = ContainerDataApp(appContext)
            DetailViewModel(
                savedStateHandle = this.createSavedStateHandle(),
                repositoriSiswa = container.repositoriSiswa
            )
        }
        initializer {
            val appContext = aplikasiContext()
            val container = ContainerDataApp(appContext)
            EditViewModel(
                savedStateHandle = this.createSavedStateHandle(),
                repositoriSiswa = container.repositoriSiswa
            )
        }
    }
}

fun CreationExtras.aplikasiContext(): Context =
    this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as Context