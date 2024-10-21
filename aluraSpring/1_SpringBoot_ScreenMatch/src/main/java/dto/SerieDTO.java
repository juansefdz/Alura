package dto;

import model.Categoria;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double evaluacion,
                       String poster,
                       Categoria genero,
                       String actores,
                       String sinopsis){
}