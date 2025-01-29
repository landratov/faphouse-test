plugins {
    id("java")
    id("io.qameta.allure-report") version "2.12.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.0")
    testImplementation ("com.codeborne:selenide:7.7.0")
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("io.qameta.allure:allure-junit5:2.17.2")
}

tasks.test {
    systemProperties("junit.jupiter.execution.parallel.enabled" to "true")
    systemProperties("junit.jupiter.execution.parallel.mode.default" to "concurrent")
    useJUnitPlatform()
}

tasks.register("chrome", Test::class.java) {
    systemProperties(mutableMapOf("selenide.browser" to "chrome"))
    systemProperties(mutableMapOf("selenide.timeout" to "10000"))
    useJUnitPlatform()
}

tasks.register("firefox", Test::class.java) {
    systemProperties(mutableMapOf("selenide.browser" to "firefox"))
    systemProperties(mutableMapOf("selenide.timeout" to "10000"))
    useJUnitPlatform()
}

tasks.register("edge", Test::class.java) {
    systemProperties(mutableMapOf("selenide.browser" to "edge"))
    systemProperties(mutableMapOf("selenide.timeout" to "10000"))
    useJUnitPlatform()
}