rootProject.name = "kotlinjs-npm-external"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

include("jspdf-yworks")
include("svg-to-pdf")
include("component")