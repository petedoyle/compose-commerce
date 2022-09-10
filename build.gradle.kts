buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath(libs.plugin.agp)
        classpath(libs.plugin.kgp)
        classpath(libs.plugin.hilt)
    }
}

apply(from = "gradle/projectDependencyGraph.gradle")

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
    }

    // Remove kotlinx-coroutines-debug, which is x86 only. Including it causes build errors:
    // https://github.com/Kotlin/kotlinx.coroutines/blob/5a71f7b8ec5fd636575a3b6408cbbc9a92b84f11/kotlinx-coroutines-debug/README.md#build-failures-due-to-duplicate-resource-files
    configurations.configureEach {
        exclude(group = "org.jetbrains.kotlinx", module = "kotlinx-coroutines-debug")
    }
}
