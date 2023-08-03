plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
}

kotlin {
    jvm()
    androidTarget()

    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.compose.viewmodel)
                implementation(libs.koin.androidx.compose)
            }
        }
    }
}

dependencies {
    commonMainImplementation(compose.ui)
    commonMainImplementation(compose.runtime)
    commonMainImplementation(libs.koin.core)
    commonMainImplementation(libs.koin.compose)

    commonMainImplementation(projects.foundation.mvi)
}

android {
    compileSdk = libs.versions.android.target.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.min.get().toInt()
    }

    namespace = "com.cinematica.foundation.mvi.compose"
}