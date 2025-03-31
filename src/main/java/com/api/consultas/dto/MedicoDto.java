package com.api.consultas.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MedicoDto {

    private String crmMedico;
    private String nome;
    private LocalDate agendaMedico;
}
