val MAIN_CLASS = "org.example.Story"

plugins {
    id("java")
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest.attributes["Main-Class"] = MAIN_CLASS
    val dependencies = configurations.runtimeClasspath.get().map(::zipTree) // OR .map { zipTree(it) }
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}