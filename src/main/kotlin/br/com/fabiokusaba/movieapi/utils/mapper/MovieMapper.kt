package br.com.fabiokusaba.movieapi.utils.mapper

import br.com.fabiokusaba.movieapi.dto.MovieDTO
import br.com.fabiokusaba.movieapi.entity.Movie
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class MovieMapper: Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO {
        return MovieDTO(
            entity.id,
            entity.name,
            entity.description,
            entity.rating
        )
    }

    override fun toEntity(domain: MovieDTO): Movie {
        return Movie(
            domain.id,
            domain.name,
            domain.description,
            domain.rating
        )
    }
}