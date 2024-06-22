package com.Final.ClinicaApiFinalversion.Repository;

import com.Final.ClinicaApiFinalversion.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    // Aquí puedes añadir métodos personalizados si necesitas realizar consultas específicas
}

