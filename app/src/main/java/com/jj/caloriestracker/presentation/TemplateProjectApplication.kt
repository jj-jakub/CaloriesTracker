package com.jj.caloriestracker.framework.presentation

import android.app.Application
import com.jj.caloriestracker.di.koin.KoinLauncher

class TemplateProjectApplication : Application() {

    private val koinLauncher = KoinLauncher()

    override fun onCreate() {
        super.onCreate()
        koinLauncher.startKoin(this)
    }
}