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
    @Column(name = "nomeMedico",nullable = false, length = 100)
    private String nome;
    @Column(name = "crmMedico",unique = true, length = 20)
    private String crm;
    @Column(name = "agendaMedico",nullable = false)
    private LocalDate agendaMedico;
}
