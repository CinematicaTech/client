plugins {
    id(libs.plugins.configurations.compose.multiplatform.get().pluginId)
    id(libs.plugins.configurations.unit.tests.mockable.get().pluginId)
}

dependencies {
    // commonMainImplementation(projects.feature.common.presentation)
    // commonMainImplementation(libs.timemates.sdk)
    // commonMainApi(projects.foundation.mvi)
    // commonMainImplementation(projects.styleSystem)
    commonMainImplementation(projects.feature.authorization.domain)

    commonMainImplementation(projects.styleSystem)

    // commonTestImplementation(projects.foundation.random)
    debugImplementation(libs.androidx.compose.tooling)
    commonMainImplementation(libs.androidx.compose.preview)
}

