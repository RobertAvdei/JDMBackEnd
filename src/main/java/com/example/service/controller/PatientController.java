package com.example.service.controller;

import com.example.service.dto.CreatePatientDto;
import com.example.service.model.Patient;
import com.example.service.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = {"http://localhost:5173","http://localhost:3000 "}
)
@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @RequestMapping(
            value = {"/patients"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public List<Patient> getPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping(
            value = {"/users"},
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public Patient newPatient(@RequestBody CreatePatientDto patient) {
        return patientService.createPatient(patient);
    }

    @RequestMapping(
            value = {"/patients/count"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public long getPatientsCount() {
        return patientService.getPatientsCount();
    }

    @RequestMapping(
            value = {"/patients/{uuid}"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public Patient getLastPatientAppointment(@PathVariable("uuid") String patientId) {
        return patientService.getPatient(patientId);
    }

}
