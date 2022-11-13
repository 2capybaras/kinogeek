package org.capybaras.kinogeek

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KinogeekApplication

fun main(args: Array<String>) {
    runApplication<KinogeekApplication>(*args)
}
