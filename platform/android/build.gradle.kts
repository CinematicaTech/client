plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    compileSdk = libs.versions.android.target.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.min.get().toInt()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }

    packaging {
        resources {
            excludes.add("META-INF/INDEX.LIST")
            excludes.add("META-INF/io.netty.versions.properties")
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.jetpackComposeCompilerVersion.get()
    }

    namespace = "com.cinematica.platform.android"
}

kotlin {
    jvmToolchain(19)
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.material3)

    implementation(libs.android.multidex)

    implementation(libs.decompose)
    implementation(libs.decompose.jetbrains.compose)

    implementation(libs.compose.accompanist.systemUiController)

    implementation(projects.styleSystem)
    implementation(projects.navigation)
}