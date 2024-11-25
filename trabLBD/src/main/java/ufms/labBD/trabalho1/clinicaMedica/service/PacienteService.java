package ufms.labBD.trabalho1.clinicaMedica.service;

import ufms.labBD.trabalho1.clinicaMedica.model.Paciente;
import ufms.labBD.trabalho1.clinicaMedica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente savePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> findAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findPacienteById(Long id) {
        return pacienteRepository.findById(id);
    }

    public Optional<Paciente> updatePaciente(Long id, Paciente pacienteDetails) {
        return pacienteRepository.findById(id).map(paciente -> {
            paciente.setNome(pacienteDetails.getNome());
            paciente.setEmail(pacienteDetails.getEmail());
            paciente.setTelefone(pacienteDetails.getTelefone());
            return pacienteRepository.save(paciente);
        });
    }

    public boolean deletePaciente(Long id) {
        return pacienteRepository.findById(id).map(paciente -> {
            pacienteRepository.delete(paciente);
            return true;
        }).orElse(false);
    }
}