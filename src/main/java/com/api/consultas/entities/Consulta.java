package com.api.consultas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @JoinColumn(name = "crm",referencedColumnName = "crmMedico", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "cpfPaciente", referencedColumnName = "cpfPaciente", nullable = false)
    private Paciente paciente;

}
