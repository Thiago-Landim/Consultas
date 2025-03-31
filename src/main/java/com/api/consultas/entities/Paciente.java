package com.api.consultas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PACIENTES")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Column(name = "NOME_PACIENTE",nullable = false ,length = 100)
    private String nomePaciente;

    @Column(name = "CPF_PACIENTE",nullable = false,unique = true,length = 11)
    private String cpfPaciente;

    @Column(name = "IDADE_PACIENTE", nullable = false)
    private int idadePaciente;


}
