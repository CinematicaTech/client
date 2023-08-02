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
    ":navigation",
)

include(
    ":style-system",
)

include(
    ":localization",
)

include(
    ":foundation:viewmodel",
)

include(
    ":preview:feature",
    ":preview:style-system",
)

include(
    ":platform:android",
    ":platform:desktop",
)

include(
    ":feature:authorization:presentation",
    ":feature:authorization:domain",
    ":feature:authorization:dependencies",
)
