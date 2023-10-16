package br.com.wfgmovieapp

import android.app.Application
import br.com.movieapp.BuildConfig
import timber.log.Timber

class MovieApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}