plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
}

kotlin {
    jvm()
    androidTarget()
}

dependencies {
    commonMainApi(compose.ui)
    commonMainImplementation(compose.material)
    commonMainApi(compose.material3)
    commonMainApi(compose.animation)
    commonMainApi(compose.foundation)
    commonMainApi(compose.materialIconsExtended)
}

android {
    namespace = "com.cinematica.style.system"
}