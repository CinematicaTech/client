plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    alias(libs.plugins.kotlin.parcelize)
}

dependencies {
    api(libs.decompose)
    api(libs.decompose.jetbrains.compose)
    implementation(libs.koin.core)

    implementation(projects.styleSystem)
    // commonMainImplementation(projects.foundation.mvi)
    // commonMainImplementation(projects.foundation.mvi.koinCompose)

    implementation(libs.kotlinx.coroutines)

    implementation(projects.feature.authorization.presentation)
}