package com.example.service.dto;

import java.util.UUID;

public class CreateAppointmentDto {

    private String date;

    private String patientId;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
