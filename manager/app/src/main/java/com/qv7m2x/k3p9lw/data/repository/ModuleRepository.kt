package com.qv7m2x.k3p9lw.data.repository

import com.qv7m2x.k3p9lw.data.model.Module
import com.qv7m2x.k3p9lw.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
