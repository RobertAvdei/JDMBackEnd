package com.example.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID patientId;
    private String name;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Set<LabResult> labResults;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "patient" ,fetch = FetchType.LAZY)
    private Set<CMAS> cmasScore;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
    private Set<Appointment> appointments;

    public Patient() {}

    public Patient(UUID patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<LabResult> getLabResults() {
        return labResults;
    }

    public void setLabResults(Set<LabResult> labResults) {
        this.labResults = labResults;
    }

    public Set<CMAS> getCmasScore() {
        return cmasScore;
    }

    public void setCmasScore(Set<CMAS> cmasScore) {
        this.cmasScore = cmasScore;
    }

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }
}
