package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidadorConsultasActivasMedico implements ValidadorDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar (DatosReservaConsulta datos){

        var consultasActivasMedico = consultaRepository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());
        if (consultasActivasMedico) {
            throw new RuntimeException("El Medico ya tiene una consulta activa en ese horario");
        }

    }
}
