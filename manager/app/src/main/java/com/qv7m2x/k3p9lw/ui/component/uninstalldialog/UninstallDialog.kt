package com.qv7m2x.k3p9lw.ui.component.uninstalldialog

import androidx.compose.runtime.Composable
import com.qv7m2x.k3p9lw.ui.LocalUiMode
import com.qv7m2x.k3p9lw.ui.UiMode

@Composable
fun UninstallDialog(
    show: Boolean,
    onDismissRequest: () -> Unit
) {
    when (LocalUiMode.current) {
        UiMode.Miuix -> UninstallDialogMiuix(show, onDismissRequest)
        UiMode.Material -> UninstallDialogMaterial(show, onDismissRequest)
    }
}
