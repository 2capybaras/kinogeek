package org.capybaras.kinogeek.repository

import org.capybaras.kinogeek.entity.Content
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository
import org.springframework.stereotype.Repository


@Repository
interface ContentRepository : ReactiveNeo4jRepository<Content, Long> {}