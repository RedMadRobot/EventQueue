plugins {
    convention.library.android
}

description = "EventQueue extensions for compose"

android {
    namespace = "$group.compose"

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    api(kotlin("stdlib"))
    api(projects.eventqueueFlow)
    api(libs.androidx.lifecycle.runtime)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui)
}
