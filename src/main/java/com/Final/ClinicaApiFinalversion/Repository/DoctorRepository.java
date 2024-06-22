package com.Final.ClinicaApiFinalversion.Repository;

import com.Final.ClinicaApiFinalversion.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}

