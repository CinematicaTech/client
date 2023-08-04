enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Cinematica"

includeBuild("build-plugins/configurations")

include(
    ":preview",
)

include(
    ":navigation",
)

include(
    ":style-system",
)

include(
    ":localization",
    ":localization:compose",
)

include(
    ":platform:android",
    ":platform:desktop",
)

include(
    ":foundation:viewmodel",
    ":foundation:mvi",
    ":foundation:mvi:koin-compose",
)

include(
    ":feature:authorization:presentation",
    ":feature:authorization:domain",
    ":feature:authorization:dependencies",
    ":feature:authorization:data"
)
