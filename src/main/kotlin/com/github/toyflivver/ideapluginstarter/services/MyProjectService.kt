package com.github.toyflivver.ideapluginstarter.services

import com.intellij.openapi.project.Project
import com.github.toyflivver.ideapluginstarter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
