package com.qv7m2x.k3p9lw.ui.util.module

fun sanitizeVersionString(version: String): String {
    return version.replace(Regex("[^a-zA-Z0-9.\\-_]"), "_")
}
