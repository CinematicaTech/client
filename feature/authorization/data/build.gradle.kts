plugins {
    id(libs.plugins.configurations.multiplatform.library.get().pluginId)
}

dependencies {
    implementation(projects.feature.authorization.domain)
}