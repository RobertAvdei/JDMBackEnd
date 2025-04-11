package com.example.service.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String appointmentId;

    @DateTimeFormat(pattern = "YYYY-MM-DDhh:mm")
    private String date;

    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Patient.class)
    private Patient patient;

    @Column(name = "patient_id")
    private String patientId;

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
