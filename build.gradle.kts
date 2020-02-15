plugins {
    kotlin("js") version "1.3.70-eap-184" apply false
    id("com.github.turansky.kfc.root") version "0.0.24"
}

allprojects {
    repositories {
        jcenter()
    }
}

tasks {
    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "6.1.1"
    }
}
