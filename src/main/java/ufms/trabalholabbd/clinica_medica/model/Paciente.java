package ufms.trabalholabbd.clinica_medica.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private ProntuarioMedico prontuarioMedico;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<ConsultaMedica> consultaMedica;

    public Paciente() {}

    public Paciente(String nome, String email, String telefone, ProntuarioMedico prontuarioMedico, List<ConsultaMedica> consultaMedica) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.prontuarioMedico = prontuarioMedico;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ProntuarioMedico getProntuarioMedico() {
        return prontuarioMedico;
    }

    public void setProntuarioMedico(ProntuarioMedico prontuarioMedico) {
        this.prontuarioMedico = prontuarioMedico;
    }

    public List<ConsultaMedica> getConsultaMedica() {
        return consultaMedica;
    }

    public void setConsultaMedica(List<ConsultaMedica> consultaMedica) {
        this.consultaMedica = consultaMedica;
    }
}
