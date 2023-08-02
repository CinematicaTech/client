plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.cinematica.preview.style.system"
    compileSdk = 34
    defaultConfig.minSdk = 24

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.jetpackComposeCompilerVersion.get()
    }
    buildFeatures.compose = true
}

dependencies {
    debugImplementation(libs.androidx.compose.tooling)
    implementation(libs.androidx.compose.preview)
    implementation(projects.styleSystem)
}