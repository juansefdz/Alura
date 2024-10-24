package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidacionPacienteActivo  implements ValidadorDeConsultas {

    @Autowired
    private PacienteRepository pacienteRepository;


    public void validar (DatosReservaConsulta datos){
        var paciente = pacienteRepository.findActivoById(datos.idPaciente());
        if(!paciente){
            throw new RuntimeException("Paciente inactivo no puede solicitar consulta");
        }
    }
}
