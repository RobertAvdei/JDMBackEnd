package com.example.service.services;

import com.example.service.dto.CreateAppointmentDto;
import com.example.service.model.Appointment;
import com.example.service.repo.AppointmentRepository;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment createAppointment(CreateAppointmentDto newAppointment) {
        Appointment appointment = new Appointment();
        appointment.setDate(newAppointment.getDate());
        appointment.setPatientId(newAppointment.getPatientId());
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
         return Lists.newArrayList(appointmentRepository.findAll());
    }

    public Appointment getLastAppointment() {
        return appointmentRepository.findFirstByOrderByDateDesc();
    }

    public Appointment getLastPatientAppointment(UUID patientId) {
        return appointmentRepository.findFirstByPatientIdOrderByDateDesc(patientId);
    }
}
