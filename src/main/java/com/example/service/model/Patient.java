package com.example.service.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID patientId;
    private String name;

    @OneToMany(mappedBy = "patient")
    private Set<LabResult> labResults;

    @OneToMany(mappedBy = "patient")
    private Set<CMAS> cmasScore;

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
}
