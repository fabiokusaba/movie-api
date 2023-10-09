package br.com.fabiokusaba.movieapi.dto

data class MovieDTO(
    var id: Int = -1,
    var name: String = "Default movie",
    var description: String = "Default description",
    var rating: Double
)
