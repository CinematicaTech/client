plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    id(libs.plugins.configurations.unit.tests.mockable.get().pluginId)
}

dependencies {
    api(projects.foundation.mvi)
    implementation(projects.styleSystem)
    implementation(projects.feature.authorization.domain)

    implementation(projects.localization)
    implementation(projects.localization.compose)
}
