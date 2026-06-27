plugins {
    id("java-library")
    id("java-gradle-plugin")
}

repositories {
    mavenCentral()
}

dependencies {
    api("me.kcra.takenaka:generator-web")
}

gradlePlugin {
    plugins {
        create("me.kcra.takenaka.takenaka-plugin") {
            id = "me.kcra.takenaka.takenaka-plugin"
            implementationClass = "me.kcra.takenaka.takenaka_plugin.TakenakaPlugin"
        }
    }
}
