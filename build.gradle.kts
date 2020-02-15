plugins {
    kotlin("js") version "1.3.70-eap-184" apply false
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
