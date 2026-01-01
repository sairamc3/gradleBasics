tasks.register("hello") {
    doFirst {
        print("Hello")
    }
    doLast {
        println(", world")
    }
}

tasks.register("world") {
    dependsOn("hello")
    doFirst {
        print("World")
    }
}