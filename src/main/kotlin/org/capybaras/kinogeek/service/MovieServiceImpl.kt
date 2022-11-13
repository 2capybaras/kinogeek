package org.capybaras.kinogeek.service

import org.capybaras.kinogeek.entity.Movie
import org.capybaras.kinogeek.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MovieServiceImpl(val movieRepository: MovieRepository) : MovieService {
    override fun findById(id: Long): Mono<Movie> {
        return movieRepository.findById(id);
    }

    override fun addMovie(movie: Movie) {
//        movieRepository.save(movie)
    }
}