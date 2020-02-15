plugins {
    kotlin("js")
    id("com.github.turansky.kfc.library")
}

kotlin {
    target {
        browser()
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))

                implementation(npm("jspdf-yworks"))
            }
        }
    }
}