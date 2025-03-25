package com.api.consultas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaDto {

    private Long idConsulta;
    private String crmMedico;
    private String cpfPaciente;
}
