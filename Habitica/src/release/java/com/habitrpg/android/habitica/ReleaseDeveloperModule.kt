package com.habitrpg.android.habitica

import android.content.Context
import com.habitrpg.android.habitica.modules.DeveloperModule
import com.habitrpg.android.habitica.proxy.AnalyticsManagerImpl
import com.habitrpg.common.habitica.helpers.AnalyticsManager

class ReleaseDeveloperModule : DeveloperModule() {
    override fun provideAnalyticsManager(context: Context): AnalyticsManager {
        return AnalyticsManagerImpl(context)
    }
}
