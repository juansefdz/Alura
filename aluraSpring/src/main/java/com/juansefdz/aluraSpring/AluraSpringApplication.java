package com.juansefdz.aluraSpring;

import io.github.cdimascio.dotenv.Dotenv;
import model.DatosEpisodio;
import model.DatosSerie;
import model.DatosTemporadas;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.Principal;
import service.ConsumoAPI;
import service.conversorDatos;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AluraSpringApplication implements CommandLineRunner {

	private final Dotenv dotenv = Dotenv.load();

	public static void main(String[] args) {
		SpringApplication.run(AluraSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.mostrarMenu();

	}
}
