package com.example.service.services;

import com.example.service.dto.CreatePatientDto;
import com.google.common.collect.*;
import com.example.service.model.Patient;
import com.example.service.repo.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(final PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient createPatient(CreatePatientDto patient) {
        Patient newPatient = new Patient();
        newPatient.setName(patient.getName());
        return patientRepository.save(newPatient);
    }

    public List<Patient> getAllPatients() {

        return Lists.newArrayList(patientRepository.findAll()) ;
    }

    public long getPatientsCount() {
        return patientRepository.count();
    }

    public Patient getPatient(String patientId) {
        Patient patient = new Patient();
        patient.setPatientId(patientId);
        return patientRepository.findBypatientId(patientId);
    }
}
