package com.qv7m2x.k3p9lw.data.model

import androidx.compose.runtime.Immutable

@Immutable
data class ModuleUpdateInfo(
    val downloadUrl: String,
    val version: String,
    val changelog: String,
    val versionCode: Int = 0,
) {
    companion object {
        val Empty = ModuleUpdateInfo("", "", "")
    }
}
