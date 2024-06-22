package com.Final.ClinicaApiFinalversion.Controller;

import com.Final.ClinicaApiFinalversion.Model.Citas;
import com.Final.ClinicaApiFinalversion.Repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CitasController {

    @Autowired
    CitasRepository citasRepository;

    // Obtener todas las citas
    @GetMapping("/citas")
    public ResponseEntity<List<Citas>> getAllCitas() {
        try {
            List<Citas> citas = citasRepository.findAll();

            if (citas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(citas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Obtener una cita por su ID
    @GetMapping("/citas/{id}")
    public ResponseEntity<Citas> getCitasById(@PathVariable("id") int id) {
        try {
            Citas cita = citasRepository.findById(id).orElse(null);

            if (cita == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<>(cita, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Crear una nueva cita
    @PostMapping("/citas")
    public ResponseEntity<Citas> createCitas(@RequestBody Citas cita) {
        try {
            Citas _cita = citasRepository.save(new Citas(cita.getMotivoCita(), cita.getEstadoCita(), cita.getID_Paciente(), cita.getID_Medico()));
            return new ResponseEntity<>(_cita, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Actualizar una cita por su ID
    @PutMapping("/citas/{id}")
    public ResponseEntity<Citas> updateCitas(@PathVariable("id") int id, @RequestBody Citas cita) {
        try {
            Citas _cita = citasRepository.findById(id).orElse(null);

            if (_cita != null) {
                _cita.setMotivoCita(cita.getMotivoCita());
                _cita.setEstadoCita(cita.getEstadoCita());
                _cita.setID_Paciente(cita.getID_Paciente());
                _cita.setID_Medico(cita.getID_Medico());

                return new ResponseEntity<>(citasRepository.save(_cita), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Eliminar una cita por su ID
    @DeleteMapping("/citas/{id}")
    public ResponseEntity<HttpStatus> deleteCitas(@PathVariable("id") int id) {
        try {
            citasRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
