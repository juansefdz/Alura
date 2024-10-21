package principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {

    /*
    * STREAMS
    * los streams son una secuencia de elementos que soportan operaciones secuenciales y paralelas
    *
    * */

    public void muestraEjemplo(){
        List <String> nombres = Arrays.asList("Juan", "Pedro", "Luis", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco", "Luisa", "Ana", "Maria", "Luisa", "Pepe", "Paco");
        nombres.stream()
                .sorted()
                .limit(5)
                .filter(x -> x.startsWith("P"))
                .map(x-> x.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
