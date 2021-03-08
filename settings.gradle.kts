pluginManagement {
    plugins {
        kotlin("jvm") version "1.4.21"
        kotlin("js") version "1.4.21"
        kotlin("multiplatform") version "1.4.21"
        kotlin("plugin.serialization") version "1.4.21"
    }
}

rootProject.name = "multiproject"
include("jvm")
include("browser")
include("multiplatform")
