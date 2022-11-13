package org.capybaras.kinogeek.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "neo4j")
@ConstructorBinding
data class Neo4jConfiguration(
    val uri: String,
    val username: String,
    val password: String
)