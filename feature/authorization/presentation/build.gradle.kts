plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    id(libs.plugins.configurations.unit.tests.mockable.get().pluginId)
}

dependencies {
    commonMainApi(projects.foundation.mvi)

    commonMainImplementation(projects.localization)
    commonMainImplementation(projects.localization.compose)
    commonMainImplementation(projects.feature.authorization.domain)
    commonMainImplementation(projects.styleSystem)
    commonTestImplementation(projects.foundation.random)
}