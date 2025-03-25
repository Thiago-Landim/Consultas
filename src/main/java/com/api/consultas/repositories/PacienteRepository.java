package com.api.consultas.repositories;

import com.api.consultas.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Long IdPaciente(Long idPaciente);
}
