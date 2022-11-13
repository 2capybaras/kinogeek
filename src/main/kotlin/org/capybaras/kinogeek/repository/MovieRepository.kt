package org.capybaras.kinogeek.repository

import org.capybaras.kinogeek.entity.Movie
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository

interface MovieRepository : ReactiveNeo4jRepository<Movie, Long> {
}