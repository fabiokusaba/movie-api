package br.com.fabiokusaba.movieapi.web.rest

import br.com.fabiokusaba.movieapi.dto.MovieDTO
import br.com.fabiokusaba.movieapi.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception
import kotlin.IllegalArgumentException

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>> {
        return ResponseEntity.ok(movieService.getMovies())
    }

    @GetMapping("/{id}")
    fun getMovie(@PathVariable id: Int): ResponseEntity<MovieDTO> {
        return ResponseEntity.ok(movieService.getMovie(id))
    }

    @PutMapping
    fun updateMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity.ok(movieService.updateMovie(movieDTO))
    }

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable id: Int): ResponseEntity<Unit> {
        return ResponseEntity(movieService.deleteMovie(id), HttpStatus.NO_CONTENT)
    }
}