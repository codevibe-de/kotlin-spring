package de.codevibe.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class App {
    companion object {
        const val API_ROOT = "/v1"
    }
}

fun main(args: Array<String>) {
    runApplication<App>(*args)
}
