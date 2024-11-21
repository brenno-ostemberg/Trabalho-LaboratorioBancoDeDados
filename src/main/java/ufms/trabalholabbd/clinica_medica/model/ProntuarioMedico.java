package ufms.trabalholabbd.clinica_medica.model;

@Entity
@Table(name = "prontuario")
public class ProntuarioMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diagnostico;
    private String prescricao;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    //construtor vazio para o
    public ProntuarioMedico() {}

    public ProntuarioMedico(Long id, String diagnostico, String prescricao, Paciente paciente) {
        this.id = id;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.paciente = paciente;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getPrescricao() {
        return prescricao;
    }
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}