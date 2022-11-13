package org.capybaras.kinogeek.entity

import org.neo4j.springframework.data.core.schema.Id
import org.neo4j.springframework.data.core.schema.Node
import org.neo4j.springframework.data.core.schema.Relationship

@Node("Director")
data class Director(
    @Id
    var id: Long
)
