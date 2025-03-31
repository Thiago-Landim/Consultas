package com.api.consultas.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ConsultaDto {

    private Long idConsulta;
    private String crmMedico;
    private String cpfPaciente;
    private LocalDate agendaMedico;
}
