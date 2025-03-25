package com.api.consultas.repositories;

import com.api.consultas.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
