package org.capybaras.kinogeek.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PingPongController {
    @GetMapping("/ping")
    fun ping(): Mono<String> {
        return Mono.just("pong")
    }
}