package principal;

import io.github.cdimascio.dotenv.Dotenv;
import model.DatosEpisodio;
import model.DatosSerie;
import model.DatosTemporadas;
import service.ConsumoAPI;
import service.conversorDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();

    private final Dotenv DOTENV = Dotenv.load();
    private final String URL = "http://www.omdbapi.com/?apikey=" + DOTENV.get("KEY");

    private conversorDatos conversor = new conversorDatos();

    public void mostrarMenu() {

        String apiKey = DOTENV.get("KEY");

        System.out.println("1. Buscar serie");
        var nombreSerie = scanner.nextLine();

        var json = consumoAPI.obtenerDatos(URL + "&t=" + nombreSerie.replace(" ", "+"));
        System.out.println(json);

        var datos = conversor.obtenerDatos(json, DatosSerie.class);
        //busca los Datos de las temporadas de la serie
        List<DatosTemporadas> temporadas = new ArrayList<>();
        for (int i=1; i <= datos.temporada(); i++) {
            json = consumoAPI.obtenerDatos(URL + "&t=" + nombreSerie.replace(" ", "+") + "&Season=" + i);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
       temporadas.forEach(System.out::println);

        /*
        for (int i=0; i < datos.temporada(); i++) {
            List<DatosEpisodio> episodioTemporada = temporadas.get(i).episodios();
            for (DatosEpisodio datosEpisodio : episodioTemporada) {
                System.out.println(datosEpisodio.titulo());
            }
        }
        */
        //EXPRESIONES LAMBDA
        /*
        *  las expresiones lambda son una forma de escribir funciones de manera más concisa.
        *  Se utilizan para definir funciones anónimas, es decir, funciones que no tienen un nombre.
        *  tenemos como ejemplo el for anterior que se puede reescribir de la siguiente manera
        *
        * */
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));



    }
}
