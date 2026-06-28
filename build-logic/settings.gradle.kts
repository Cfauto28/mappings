includeBuild("../takenaka") {
    dependencySubstitution {
        substitute(module("me.kcra.takenaka:generator-web")).using(project(":generator-web"))
    }
}

