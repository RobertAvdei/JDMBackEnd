package com.example.service.dto;

import java.util.UUID;

public class CreateAppointmentDto {

    private String date;

    private UUID patientId;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }
}
