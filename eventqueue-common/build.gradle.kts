plugins {
    id("com.redmadrobot.kotlin-library")
    convention.publishing
    convention.detekt
}

description = "EventQueue common"

dependencies {
    api(kotlin("stdlib"))
}
