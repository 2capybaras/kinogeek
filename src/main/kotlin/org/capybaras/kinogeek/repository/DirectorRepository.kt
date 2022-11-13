package org.capybaras.kinogeek.repository

import org.capybaras.kinogeek.entity.Director
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository

interface DirectorRepository : ReactiveNeo4jRepository<Director, Long> {
}