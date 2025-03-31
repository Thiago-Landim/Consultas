package com.api.consultas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idConsulta;

    @ManyToOne
    @JoinColumn(name = "ID_MEDICO",referencedColumnName = "ID_MEDICO", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "IdPaciente", nullable = false)
    private Paciente paciente;

    @Column(name = "HORARIO_CONSULTA")
    private LocalDate agendaMedico;



}
