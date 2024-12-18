package ufms.labBD.trabalho1.clinicaMedica.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;

    //um médico pode ter n consultas
    @OneToMany(mappedBy = "medico")
    private List<ConsultaMedica> consultaMedica;

    public Medico() {
    }

    public Medico(Long id, String nome, String especialidade, List<ConsultaMedica> consultaMedica) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.consultaMedica = consultaMedica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<ConsultaMedica> getConsultaMedica() {
        return consultaMedica;
    }

    public void setConsultaMedica(List<ConsultaMedica> consultaMedica) {
        this.consultaMedica = consultaMedica;
    }
}