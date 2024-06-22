package com.Final.ClinicaApiFinalversion.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Paciente")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Paciente")
    private int ID_Paciente;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Direccion")
    private String Direccion;
    @Column(name = "Telefono")
    private String Telefono;
    @Column(name = "FecgadeNacimiento")
    private String FechadeNacimiento;
    public Patient() {
    }

    public Patient(String nombre, String direccion, String telefono, String fechadeNacimiento) {
    }


    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getFechadeNacimiento() {
        return FechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        FechadeNacimiento = fechadeNacimiento;
    }
}