package org.capybaras.kinogeek.repository

import org.capybaras.kinogeek.entity.Person
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository

interface PersonRepository : ReactiveNeo4jRepository<Person, Long> {
}