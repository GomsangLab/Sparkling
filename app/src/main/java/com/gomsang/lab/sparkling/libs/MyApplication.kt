package com.gomsang.lab.sparkling.libs

import android.app.Application
import com.gomsang.lab.sparkling.libs.di.MyModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, MyModule.myDiModule)
    }
}