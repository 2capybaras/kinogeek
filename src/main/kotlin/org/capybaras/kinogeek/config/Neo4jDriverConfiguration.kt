package org.capybaras.kinogeek.config

import org.neo4j.driver.AuthTokens
import org.neo4j.driver.Driver
import org.neo4j.driver.GraphDatabase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Neo4jDriverConfiguration(val neo4jConfig: Neo4jConfiguration) {
    @Bean
    fun neo4jDriver(): Driver =
        GraphDatabase.driver(neo4jConfig.uri, AuthTokens.basic(neo4jConfig.username, neo4jConfig.password))
}