package com.qv7m2x.k3p9lw.ui.viewmodel

import androidx.compose.runtime.Immutable
import com.qv7m2x.k3p9lw.ui.UiMode
import com.qv7m2x.k3p9lw.ui.theme.AppSettings

@Immutable
data class MainActivityUiState(
    val appSettings: AppSettings,
    val pageScale: Float,
    val enableBlur: Boolean,
    val enableFloatingBottomBar: Boolean,
    val enableFloatingBottomBarBlur: Boolean,
    val enableNavigationBadge: Boolean,
    val enableSwipeDismiss: Boolean,
    val pagerInterceptionMode: Int,
    val moduleDescriptionMaxLines: Int = 4,
    val uiMode: UiMode,
)
