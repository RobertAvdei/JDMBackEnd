package com.example.service.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class CMAS {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID cmasId;

    private String date;

    private String scroe;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public CMAS() {
    }

    public CMAS(UUID cmasId, String date, String scroe, Patient patient) {
        this.cmasId = cmasId;
        this.date = date;
        this.scroe = scroe;
        this.patient = patient;
    }

    public UUID getCmasId() {
        return cmasId;
    }

    public void setCmasId(UUID cmasId) {
        this.cmasId = cmasId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScroe() {
        return scroe;
    }

    public void setScroe(String scroe) {
        this.scroe = scroe;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
