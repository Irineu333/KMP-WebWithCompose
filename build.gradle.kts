plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "org.example"
version = "1.0-DEV"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

kotlin {

    // implement project targets
    // https://kotlinlang.org/docs/multiplatform-discover-project.html#targets

    sourceSets {
        // implement project source sets
        // https://kotlinlang.org/docs/multiplatform-discover-project.html#source-sets
    }
}