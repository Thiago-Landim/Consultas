package com.api.consultas.mapper;

import com.api.consultas.dto.ConsultaDto;
import com.api.consultas.entities.Consulta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConsultaMapper {
    // Instância do Mapper gerada pelo MapStruct
    ConsultaMapper INSTANCE = Mappers.getMapper(ConsultaMapper.class);

    // Mapeamento de Consulta para ConsultaDTO
    @Mapping(source = "medico.crm", target = "crmMedico")
    @Mapping(source = "paciente.cpf", target = "cpfPaciente")
    ConsultaDto toConsultaDTO(Consulta consulta);

    // Mapeamento de ConsultaDTO para Consulta
    @Mapping(source = "crmMedico", target = "medico.crm")
    @Mapping(source = "cpfPaciente", target = "paciente.cpf")
    Consulta toConsulta(ConsultaDto consultaDTO);
}
