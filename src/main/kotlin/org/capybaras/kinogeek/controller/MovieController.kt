package org.capybaras.kinogeek.controller

import org.capybaras.kinogeek.entity.Movie
import org.capybaras.kinogeek.service.MovieService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class MovieController(
    val movieService: MovieService
) {
    @GetMapping("/{id}")
    fun getMovieByName(@PathVariable id: Long): Mono<Movie> {
        return movieService.findById(id)
    }

    @PostMapping()
    fun addMovie(@RequestBody movie: Movie) {
        movieService.addMovie(movie)
    }
}