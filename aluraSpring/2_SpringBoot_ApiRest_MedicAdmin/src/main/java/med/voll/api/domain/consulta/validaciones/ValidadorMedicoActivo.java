package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidadorMedicoActivo implements ValidadorDeConsultas{

    @Autowired
    private MedicoRepository medicoRepository;

    public void validar (DatosReservaConsulta datos){
        if (datos.idMedico()==null){
          return;
        }
        var MedicoIsActive = medicoRepository.findActivoById(datos.idMedico());
        if(!MedicoIsActive){
            throw new RuntimeException("Medico inactivo, no puede atender consulta");
        }
    }
}
