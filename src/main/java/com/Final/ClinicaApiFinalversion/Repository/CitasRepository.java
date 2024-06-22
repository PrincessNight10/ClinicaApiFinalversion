package com.Final.ClinicaApiFinalversion.Repository;
import com.Final.ClinicaApiFinalversion.Model.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository<Citas, Integer> {
    // Aquí puedes añadir métodos personalizados si necesitas realizar consultas específicas
}

