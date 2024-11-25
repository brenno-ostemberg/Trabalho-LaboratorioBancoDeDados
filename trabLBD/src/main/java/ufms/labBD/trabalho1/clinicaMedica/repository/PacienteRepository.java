package ufms.labBD.trabalho1.clinicaMedica.repository;

import ufms.labBD.trabalho1.clinicaMedica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    //spring implementa?
}
