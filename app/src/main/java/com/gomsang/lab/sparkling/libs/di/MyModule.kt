package com.gomsang.lab.sparkling.libs.di

import com.gomsang.lab.sparkling.ui.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object MyModule {
    var viewModeModule = module {
        viewModel {
            MainViewModel()
        }
    }
    var myDiModule = listOf(viewModeModule)
}