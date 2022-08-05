package com.github.duosl.ideaplugintemplte.services

import com.intellij.openapi.project.Project
import com.github.duosl.ideaplugintemplte.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
