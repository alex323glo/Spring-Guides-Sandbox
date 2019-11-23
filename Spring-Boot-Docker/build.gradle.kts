buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.2.1.RELEASE")
    }
}

plugins {
    java
    id("idea")
    id("org.springframework.boot") version("2.2.1.RELEASE")
    id("io.spring.dependency-management") version("1.0.8.RELEASE")
}

group = "com.alex323glo.tutorials.spring.docker"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}