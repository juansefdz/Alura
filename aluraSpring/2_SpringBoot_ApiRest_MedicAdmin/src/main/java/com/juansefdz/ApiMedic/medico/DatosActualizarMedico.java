package com.juansefdz.ApiMedic.medico;

import com.juansefdz.ApiMedic.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;


public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
}