plugins {
    java
    application
}

application {
    mainClass = "com.microsoft.playwright.CLI"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(files("src/main/resources/wrapper.jar"))
    implementation("com.microsoft.playwright:playwright:1.40.0")
    implementation("org.json:json:20231013")
    implementation("com.itextpdf:itext-core:8.0.2")
    implementation("org.slf4j:slf4j-simple:2.0.11")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    withType<JavaCompile> {
        options.compilerArgs.add("--enable-preview")
        options.encoding = "UTF-8";
    }
    withType<JavaExec> {
        jvmArgs("--enable-preview")
    }
    withType<Test> {
        jvmArgs("--enable-preview")
        useJUnitPlatform()
    }
}


