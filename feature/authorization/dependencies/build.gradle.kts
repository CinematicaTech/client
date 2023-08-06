plugins {
    id(libs.plugins.configurations.koin.annotations.get().pluginId)
}

kotlin {
    jvm {
        jvmToolchain(11)
    }
    android()

    sourceSets {
        val jvmMain by getting {
            kotlin.srcDir("build/generated/ksp/jvm/jvmMain/kotlin")
        }
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines)

    implementation(projects.feature.authorization.domain)
    implementation(projects.feature.authorization.presentation)
//    commonMainImplementation(projects.feature.authorization.data)
//    commonMainImplementation(projects.feature.authorization.data.database)
//
//    commonMainImplementation(projects.feature.common.domain)
}
