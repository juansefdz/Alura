package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosTemporadas(
        @JsonAlias("Season")
        Integer temporada,
        @JsonAlias("Episodes")
        List <DatosEpisodio> episodios
) {
}
