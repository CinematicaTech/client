plugins {
    id("multiplatform-library-convention")
    id("org.jetbrains.compose")
    id("com.android.library")
}

kotlin {
    jvmToolchain(19)
}

android {
    compileSdk = 34

    defaultConfig {
        namespace = "com.cinematica.ui"
    }

    compileOptions {
        targetCompatibility = JavaVersion.VERSION_19
        sourceCompatibility = JavaVersion.VERSION_19
    }
}

dependencies {
    api(compose.ui)
    api(compose.foundation)
    api(compose.runtime)
    api(compose.material3)
    api(compose.materialIconsExtended)
    api(compose.uiTooling)
}