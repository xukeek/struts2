package com.github.xukeek.struts.extensions

import com.github.xukeek.struts.services.MyProjectService
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class ProjectStartActivity : StartupActivity {

    override fun runActivity(project: Project) {
        project.getService(MyProjectService::class.java)
    }
}
