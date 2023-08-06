plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
}

dependencies {
    implementation(projects.localization)
}