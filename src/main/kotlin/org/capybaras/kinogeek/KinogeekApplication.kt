package org.capybaras.kinogeek

import org.capybaras.kinogeek.config.Neo4jConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Neo4jConfiguration::class)
class KinogeekApplication

fun main(args: Array<String>) {
    runApplication<KinogeekApplication>(*args)
}
