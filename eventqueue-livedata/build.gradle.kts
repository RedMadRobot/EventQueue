plugins {
    convention.library.android
}

description = "EventQueue implemented via LiveData"

android {
    namespace = "$group.livedata"
}

dependencies {
    api(kotlin("stdlib"))
    api(projects.eventqueueCommon)
    api(libs.androidx.lifecycle.common)
    api(libs.androidx.lifecycle.livedata.core)
    api(libs.androidx.activity)
    api(libs.androidx.annotation)
    api(libs.androidx.fragment)

    testImplementation(libs.kotlin.test.junit5)
    testImplementation(libs.junit.jupiter.api)
    testImplementation(libs.assertj.core)
    testImplementation(libs.androidx.arch.core.testing)
    testRuntimeOnly(libs.junit.jupiter.engine)
}
