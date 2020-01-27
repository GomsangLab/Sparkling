package com.gomsang.lab.sparkling

import android.app.Application
import com.gomsang.lab.sparkling.di.MyModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, MyModule.myDiModule)
    }
}