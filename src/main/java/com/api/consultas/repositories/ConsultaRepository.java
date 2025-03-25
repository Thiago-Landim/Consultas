package com.api.consultas.repositories;

import com.api.consultas.entities.Consulta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultaRepository {
    List<Consulta> findByMedicoId(Long IdMedico);

    List<Consulta> findByPacienteId(Long IdPaciente);

    Consulta save(Consulta consulta);
}
