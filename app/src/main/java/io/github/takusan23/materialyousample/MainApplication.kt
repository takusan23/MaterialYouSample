package io.github.takusan23.materialyousample

import android.app.Application
import com.google.android.material.color.DynamicColors

/** アプリが起動したら呼ばれる */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // 動的テーマ有効化
        DynamicColors.applyToActivitiesIfAvailable(this)
    }

}