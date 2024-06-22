package com.Final.ClinicaApiFinalversion.Model;


import jakarta.persistence.*; // for Spring Boot 3


@Entity
@Table(name = "Citas") // Nombre de la tabla en la base de datos
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Citas")
    private int ID_Citas;

    @Column(name = "MotivoCita")
    private String motivoCita;

    @Column(name = "EstadoCita")
    @Enumerated(EnumType.STRING)
    private EstadoCita estadoCita;


    @Column(name = "ID_Paciente")
    private int ID_Paciente;

    @Column(name = "ID_Medico")
    private int ID_Medico;

    // Constructor vacío requerido por JPA
    public Citas() {
    }

    public Citas(String motivoCita, EstadoCita estadoCita, int idPaciente, int idMedico) {
    }

    public int getID_Citas() {
        return ID_Citas;
    }

    public void setID_Citas(int ID_Citas) {
        this.ID_Citas = ID_Citas;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public int getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(int ID_Medico) {
        this.ID_Medico = ID_Medico;
    }
}
