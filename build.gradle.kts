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

    js {

        binaries.executable()

        browser()
    }

    sourceSets {

        val jsMain by getting

    }
}