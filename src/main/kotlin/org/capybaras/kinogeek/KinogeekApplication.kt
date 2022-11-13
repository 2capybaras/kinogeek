package org.capybaras.kinogeek

import org.neo4j.springframework.data.repository.config.EnableReactiveNeo4jRepositories
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class KinogeekApplication

fun main(args: Array<String>) {
    runApplication<KinogeekApplication>(*args)
}
