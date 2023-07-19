package de.codevibe.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringTestApplication>(*args)
}
