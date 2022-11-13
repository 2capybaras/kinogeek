package org.capybaras.kinogeek.service

import org.capybaras.kinogeek.entity.Movie
import reactor.core.publisher.Mono

interface MovieService {
    fun findById(id: Long): Mono<Movie>
}