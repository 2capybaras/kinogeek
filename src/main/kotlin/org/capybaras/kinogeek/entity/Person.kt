package org.capybaras.kinogeek.entity

import lombok.Builder
import org.neo4j.springframework.data.core.schema.Id
import org.neo4j.springframework.data.core.schema.Node
import org.neo4j.springframework.data.core.schema.Relationship

@Node
data class Person(
    @Id
    var id: Long,
    var name: String,
//    @Relationship(type = "DIRECTED", direction = Relationship.Direction.INCOMING)
    var directs: MutableSet<Movie>
)
