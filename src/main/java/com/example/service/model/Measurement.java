package com.example.service.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID measurementId;

    private String dateTime;

    private String value;

    @ManyToOne
    @JoinColumn(name = "lab_result_id")
    private LabResult labResult;

    public Measurement() {
    }

    public Measurement(UUID measurementId, String dateTime, String value, LabResult labResult) {
        this.measurementId = measurementId;
        this.dateTime = dateTime;
        this.value = value;
        this.labResult = labResult;
    }

    public LabResult getLabResult() {
        return labResult;
    }

    public void setLabResult(LabResult labResult) {
        this.labResult = labResult;
    }

    public UUID getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(UUID measurementId) {
        this.measurementId = measurementId;
    }

    public String getdateTime() {
        return dateTime;
    }

    public void setdateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
