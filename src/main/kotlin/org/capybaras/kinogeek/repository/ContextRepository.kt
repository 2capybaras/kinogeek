package org.capybaras.kinogeek.repository

import org.capybaras.kinogeek.entity.Context
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface ContextRepository : ReactiveNeo4jRepository<Context, Long> {

}