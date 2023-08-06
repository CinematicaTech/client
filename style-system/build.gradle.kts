plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
}

dependencies {
    api(compose.ui)
    api(compose.material3)
    api(compose.animation)
    api(compose.foundation)
    api(compose.materialIconsExtended)

    implementation(compose.material)
}

android {
    namespace = "com.cinematica.style.system"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}