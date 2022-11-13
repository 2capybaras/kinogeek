package org.capybaras.kinogeek.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HealthCheckController {
    @GetMapping("/health")
    fun healthCheck(): Mono<Unit> {
        return Mono.just(Unit)
    }
}