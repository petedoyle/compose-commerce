plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    alias(libs.plugins.openapi.generator)
}

apply(from = "$rootDir/gradle/defaults-android-library.gradle")

android {
    buildFeatures {
        buildConfig = true
    }

    flavorDimensions.add("stage")
    productFlavors {
        register("production") {
            dimension = "stage"
        }

        register("staging") {
            dimension = "stage"
        }

        register("sandbox") {
            dimension = "stage"
        }

        register("dev") {
            dimension = "stage"
        }
    }
}

dependencies {
    implementation(project(":common-coroutine-dispatchers"))
    implementation(project(":common-api-bigcommerce-catalog-v3"))
    implementation(project(":common-api-bigcommerce-carts-v3"))
    implementation(libs.androidx.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    kapt(libs.androidx.hilt.compiler)
    implementation(libs.eithernet)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.moshi.kotlin)
    implementation(libs.okhttp.logging)
    kapt(libs.moshi.kotlin.codegen)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.moshi)

    testImplementation(libs.junit.junit)
    testImplementation(libs.mockk)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
}
