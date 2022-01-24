package com.jj.caloriestracker.di.koin

import com.jj.caloriestracker.data.network.RetrofitFactory
import com.jj.caloriestracker.data.text.VersionTextProvider
import org.koin.dsl.module

val mainModule = module {

    single { RetrofitFactory() }
    single { VersionTextProvider() }
}