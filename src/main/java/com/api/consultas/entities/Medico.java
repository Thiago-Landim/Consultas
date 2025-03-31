package com.api.consultas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Medico")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;
    @Column(name = "NOME_MEDICO",nullable = false, length = 100)
    private String nome;
    @Column(name = "CRM_MEDICO",unique = true, length = 20)
    private String crm;
    @Column(name = "AGENDA_MEDICO",nullable = false)
    private LocalDate agendaMedico;
}
