package com.sefayilmaz.foursquarekotlincln

import android.app.Application
import com.parse.Parse

class StarterApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)
        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("RnDSHkxROPzTOLUMWdnEtcI4Iho6i9PycfQ8c5I2")
            .clientKey("ZvHQKzwWDtygI0L3Wft0cYuAZHSwLStEOpVHkDyP")
            .server("https://parseapi.back4app.com/")
            .build()
        )
    }
}