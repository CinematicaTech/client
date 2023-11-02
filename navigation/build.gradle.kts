plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    alias(libs.plugins.kotlin.parcelize)
}

dependencies {
    commonMainApi(libs.decompose)
    commonMainApi(libs.decompose.jetbrains.compose)

    commonMainImplementation(projects.styleSystem)
}