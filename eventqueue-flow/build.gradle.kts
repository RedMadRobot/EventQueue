plugins {
    convention.library.android
}

description = "EventQueue implemented via flow"

android {
    namespace = "$group.flow"
}

dependencies {
    api(kotlin("stdlib"))
    api(projects.eventqueueCommon)
    api(libs.androidx.lifecycle.common)
}
