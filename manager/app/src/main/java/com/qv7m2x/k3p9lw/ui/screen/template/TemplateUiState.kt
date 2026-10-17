package com.qv7m2x.k3p9lw.ui.screen.template

import androidx.compose.runtime.Immutable
import com.qv7m2x.k3p9lw.data.model.TemplateInfo

@Immutable
data class TemplateUiState(
    val isRefreshing: Boolean = false,
    val offline: Boolean = false,
    val templates: List<TemplateInfo> = emptyList(),
    val templateList: List<TemplateInfo> = emptyList(),
    val error: Throwable? = null,
)

@Immutable
data class TemplateActions(
    val onBack: () -> Unit,
    val onRefresh: (Boolean) -> Unit,
    val onImport: () -> Unit,
    val onExport: () -> Unit,
    val onCreateTemplate: () -> Unit,
    val onOpenTemplate: (TemplateInfo) -> Unit,
)
