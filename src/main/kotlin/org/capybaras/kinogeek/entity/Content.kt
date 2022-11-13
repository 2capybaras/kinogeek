package org.capybaras.kinogeek.entity

import org.neo4j.springframework.data.core.schema.Id
import org.neo4j.springframework.data.core.schema.Node

@Node
data class Content(
    @Id var id: Long
)
