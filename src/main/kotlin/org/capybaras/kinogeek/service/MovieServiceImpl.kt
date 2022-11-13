package org.capybaras.kinogeek.service

import org.capybaras.kinogeek.entity.Movie
import org.capybaras.kinogeek.repository.MovieRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MovieServiceImpl(val movieRepository: MovieRepository) : MovieService {
    override fun findById(id: Long): Mono<Movie> {
        return movieRepository.findById(id);
    }
}