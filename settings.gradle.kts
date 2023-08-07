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
    ":foundation:mvi",
    ":foundation:mvi:koin-compose",
    ":foundation:viewmodel",
    ":foundation:random",
    ":foundation:validation",
    ":foundation:stdlib-ext",
    ":foundation:system-tray",
    ":foundation:shimmer-compose",
    ":foundation:time",
)

include(
    ":feature:authorization:presentation",
    ":feature:authorization:domain",
    ":feature:authorization:dependencies",
    ":feature:authorization:data"
)