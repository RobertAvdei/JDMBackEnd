package com.example.service.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

@Entity
public class CMAS {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID cmasId;

    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String date;

    private String score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public CMAS() {
    }

    public CMAS(UUID cmasId, String date, String score, Patient patient) {
        this.cmasId = cmasId;
        this.date = date;
        this.score = score;
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
