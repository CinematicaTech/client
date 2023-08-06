plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
}

kotlin {
    jvm()
    android()

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
    implementation(compose.ui)
    implementation(compose.runtime)
    implementation(libs.koin.core)
    implementation(libs.koin.compose)
    implementation(projects.foundation.mvi)
}

android {
    compileSdk = libs.versions.android.target.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.min.get().toInt()
    }

    namespace = "com.cinematica.foundation.mvi.compose"
}