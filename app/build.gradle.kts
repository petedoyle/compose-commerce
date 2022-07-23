plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 31
        versionCode = 33
        versionName = "1.0 ($versionCode)"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions.add("stage")
    productFlavors {
        register("production") {
            dimension = "stage"
            applicationId = "dev.petedoyle.commerce"
        }

        register("staging") {
            dimension = "stage"
            applicationId = "dev.petedoyle.commerce.staging"
        }

        register("sandbox") {
            dimension = "stage"
            applicationId = "dev.petedoyle.commerce.sandbox"
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidx.compose.compiler.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":common-api-bigcommerce-client"))
    implementation(project(":common-api-bigcommerce-carts-v3"))
    implementation(project(":common-api-bigcommerce-catalog-v3"))
    implementation(project(":common-coroutine-dispatchers"))
    implementation(project(":common-flux"))
    implementation(project(":common-mvi"))
    implementation(project(":common-design-system"))
    implementation(libs.accompanist.navigation.animation)
    implementation(libs.accompanist.insets)
    implementation(libs.accompanist.insets.ui)
    implementation(libs.accompanist.placeholder.material)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    kapt(libs.androidx.hilt.compiler)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.coil)
    implementation(libs.coil.compose)
    implementation(libs.eithernet)
    implementation(libs.retrofit)
    implementation(libs.play.core)
    implementation(libs.play.core.ktx)

    // Desugaring
    coreLibraryDesugaring(libs.android.core.desugaring)

    debugImplementation(libs.androidx.compose.ui.tooling)

    testImplementation(project(":common-test-unit"))
    testImplementation(libs.cashapp.turbine)
    testImplementation(libs.expectKt)
    testImplementation(libs.junit.junit)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.mockk)
    testImplementation(testFixtures("com.slack.eithernet:eithernet:" + libs.versions.eithernet.get()))

    androidTestImplementation(project(":common-test-android"))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.espresso.core)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.androidx.test.ext.truth)
    androidTestImplementation(libs.cashapp.turbine)
    androidTestImplementation(libs.expectKt)
    androidTestImplementation(libs.kotlinx.coroutines.test)
    androidTestImplementation(libs.mockk.android)
}