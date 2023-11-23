plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // logging
    implementation("org.slf4j:slf4j-simple:1.7.25")
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.10")

    // test
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))
    testImplementation("org.junit.platform:junit-platform-launcher")
    testImplementation("org.junit.platform:junit-platform-engine")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}