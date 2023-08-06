plugins {
    id("multiplatform-library-convention")
}

val kotlinVersion = KotlinVersion.CURRENT.toString()
val coroutinesVersion = "1.7.2"

kotlin {
    sourceSets {
        val jvmTest by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")
                implementation("org.jetbrains.kotlin:kotlin-test-junit5:$kotlinVersion")
            }
        }
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-common:$kotlinVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}