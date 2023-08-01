import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.multiplatform)
    // application
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(compose.runtime)
}

java {
    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}

compose.desktop {
    application {
        mainClass = "DesktopApplicationKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb, TargetFormat.Exe)
            packageName = "Cinematica"
            packageVersion = "1.0.1"
        }
    }
}