package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorConsulta implements ValidadorDeConsultas {

    public void validar(DatosReservaConsulta datos) {
        var fechaConsulta = datos.fecha();
        var horaActual = LocalDateTime.now();
        var diferencia = Duration.between(horaActual, fechaConsulta).toMinutes();
        if (diferencia < 30) {
            throw new RuntimeException("La consulta debe ser solicitada con al menos 30 minutos de anticipación");
        }
    }
}