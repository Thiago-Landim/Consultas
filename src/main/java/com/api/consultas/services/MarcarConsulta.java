package com.api.consultas.services;

import com.api.consultas.entities.Consulta;
import com.api.consultas.entities.Medico;
import com.api.consultas.entities.Paciente;
import com.api.consultas.repositories.ConsultaRepository;
import com.api.consultas.repositories.MedicoRepository;
import com.api.consultas.repositories.PacienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MarcarConsulta {

    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;


    @Transactional
    public Consulta marcarConsulta(Long idMedico, Long IdPaciente, LocalDate agendaMedico) {
        //verifica se o médico existe.
        Medico medico = medicoRepository.findById(idMedico)
                .orElseThrow(()-> new RuntimeException("Medico no encontrado"));

        //verifica se o paciente existe.
        Paciente paciente = pacienteRepository.findById(IdPaciente)
                .orElseThrow(()-> new RuntimeException("Paciente no encontrado"));



        // 3. Verifica se o médico está disponível no horário

        boolean medicoOcupado = consultaRepository.findByMedicoId(idMedico)
                .stream()
                .anyMatch(consulta -> consulta.getMedico().getAgendaMedico().equals(agendaMedico));
        if (medicoOcupado){
            throw new RuntimeException("Medico indicponivel no horario solicitado");
        }
        Consulta consulta = new Consulta();
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);
        consulta.getMedico().setAgendaMedico(agendaMedico);
        return consultaRepository.save(consulta);
    }


}
