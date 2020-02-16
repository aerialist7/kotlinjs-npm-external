plugins {
    kotlin("js")
    id("com.github.turansky.kfc.component")
}

component {
    root = "com.github.aerialist7.Api"
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(project(":svg-to-pdf"))
}