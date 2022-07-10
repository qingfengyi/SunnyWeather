package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *@author guoxuqiang
 *@date 2022 07 2022/7/10 11:50
 */
class SunnyWeatherApplication : Application() {

    companion object{
        const val TOKEN="彩云天气token"
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }

}