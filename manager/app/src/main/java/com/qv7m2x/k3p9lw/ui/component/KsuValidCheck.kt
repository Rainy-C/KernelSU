package com.qv7m2x.k3p9lw.ui.component

import androidx.compose.runtime.Composable
import com.qv7m2x.k3p9lw.Natives

@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.isManager
    val ksuVersion = if (isManager) Natives.version else null

    if (ksuVersion != null) {
        content()
    }
}
