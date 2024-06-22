package com.Final.ClinicaApiFinalversion.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Medico")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Paciente")
    private int ID_Medico;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Especialidad")
    private String Especialidad;

    @Column(name = "Direccion")
    private String Direccion;
    @Column(name = "Telefono")
    private String Telefono;


    public Doctor(String nombre, String especialidad, String direccion, String telefono) {
       this. Nombre = nombre;
       this.Especialidad = especialidad;
        this.Direccion = direccion;
        this.Telefono = telefono;
    }


    public Doctor() {

    }


    // Getters y Setters
    public int getIdMedico() {
        return ID_Medico;
    }

    public void setIdMedico(int idMedico) {
        this.ID_Medico = idMedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.Especialidad = especialidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
    
}