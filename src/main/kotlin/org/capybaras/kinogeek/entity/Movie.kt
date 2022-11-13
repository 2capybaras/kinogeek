package org.capybaras.kinogeek.entity


import org.neo4j.springframework.data.core.schema.Id
import org.neo4j.springframework.data.core.schema.Node
import org.neo4j.springframework.data.core.schema.Relationship

@Node
data class Movie(
    @Id
    var id: Long? = null,
//    @Relationship(type = "ACTED_IN", direction = Relationship.Direction.INCOMING)
//    var directors: MutableList<Director>? = null
)
