package com.example.service.repo;

import com.example.service.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
    Patient findBypatientId(String patientId);
}
