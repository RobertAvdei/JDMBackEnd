package com.example.service.repo;

import com.example.service.model.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
    Appointment findFirstByOrderByDateDesc();
    Appointment findFirstByPatientIdOrderByDateDesc(UUID patientId);
}
