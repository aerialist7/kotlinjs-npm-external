plugins {
    kotlin("js") version "1.3.70-eap-184" apply false
    id("com.github.turansky.kfc.root") version "0.0.25"
    id("com.github.turansky.kfc.component") version "0.0.25" apply false
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.1.1"
    }
}
