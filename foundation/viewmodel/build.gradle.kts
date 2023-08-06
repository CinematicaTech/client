plugins {
    id(libs.plugins.configurations.multiplatform.library.get().pluginId)
}

kotlin {
    dependencies {
        api(libs.androidx.lifecycle)
    }
}

android {
    compileSdk = libs.versions.android.target.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.min.get().toInt()
    }

    namespace = "com.cinematica.foundation.viewmodel"
}

dependencies {
    commonMainImplementation(libs.kotlinx.coroutines)
}