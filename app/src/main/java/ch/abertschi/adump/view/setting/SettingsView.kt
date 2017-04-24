package ch.abertschi.adump.view.setting

import android.content.Context
import android.view.View

/**
 * Created by abertschi on 21.04.17.
 */

interface SettingsView {

    fun setActivePlugin(index: Int)
    fun getContext(): Context
    fun showSuggestNewPlugin()
    fun setPluginView(view: View)
    fun clearPluginView()
}