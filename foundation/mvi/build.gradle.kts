plugins {
    id(libs.plugins.configurations.multiplatform.library.get().pluginId)
}

kotlin {
    jvm()

    explicitApi()
}

dependencies {
    api(projects.foundation.viewmodel)
    implementation(libs.kotlinx.coroutines)
}