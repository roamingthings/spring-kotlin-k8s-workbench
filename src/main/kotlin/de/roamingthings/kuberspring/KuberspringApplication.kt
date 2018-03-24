package de.roamingthings.kuberspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KuberspringApplication

fun main(args: Array<String>) {
    runApplication<KuberspringApplication>(*args)
}
