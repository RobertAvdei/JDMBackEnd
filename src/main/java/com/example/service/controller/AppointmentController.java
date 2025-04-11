package com.example.service.controller;

import com.example.service.model.Appointment;
import com.example.service.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin(
        origins = {"http://localhost:5173"}
)
@RestController
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(final AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @RequestMapping(
            value = {"/appointments/last"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public Appointment getLastAppointment() {

        return appointmentService.getLastAppointment();
    }

    @RequestMapping(
            value = {"/appointments/patient/{uuid}"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public Appointment getLastPatientAppointment(@PathVariable("uuid") UUID patientId) {
        return appointmentService.getLastPatientAppointment(patientId);
    }
}
