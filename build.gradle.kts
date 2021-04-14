// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }


    dependencies {
        val kotlinVersion = "1.3.61"
        extra["kotlinVersion"] = kotlinVersion

        classpath("com.android.tools.build:gradle:4.1.3")
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean",Delete::class) {
    delete(rootProject.buildDir)
}