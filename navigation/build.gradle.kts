plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    alias(libs.plugins.kotlin.parcelize)
}

dependencies {
    commonMainApi(libs.decompose)
    commonMainApi(libs.decompose.jetbrains.compose)
    commonMainImplementation(libs.koin.core)

    commonMainImplementation(projects.styleSystem)
    // commonMainImplementation(projects.foundation.mvi)
    // commonMainImplementation(projects.foundation.mvi.koinCompose)

    commonMainImplementation(libs.kotlinx.coroutines)

    commonMainImplementation(projects.feature.authorization.presentation)
}