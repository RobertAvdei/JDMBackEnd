package com.example.service.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class CMAS {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String cmasId;

    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String date;

    private String score;

    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Patient.class)
    private Patient patient;

    @Column(name = "patient_id")
    private String patientId;

    public CMAS() {
    }

    public CMAS(String cmasId, String date, String score, Patient patient) {
        this.cmasId = cmasId;
        this.date = date;
        this.score = score;
        this.patient = patient;
    }

    public String getCmasId() {
        return cmasId;
    }

    public void setCmasId(String cmasId) {
        this.cmasId = cmasId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
