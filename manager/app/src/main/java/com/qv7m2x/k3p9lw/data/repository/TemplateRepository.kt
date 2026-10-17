package com.qv7m2x.k3p9lw.data.repository

import com.qv7m2x.k3p9lw.data.model.TemplateInfo

interface TemplateRepository {
    suspend fun getTemplates(sync: Boolean): Result<List<TemplateInfo>>
    suspend fun importTemplates(jsonString: String): Result<Unit>
    suspend fun exportTemplates(): Result<String>
    suspend fun getTemplate(id: String): Result<TemplateInfo>
}
