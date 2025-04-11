package com.example.service.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String measurementId;


    @DateTimeFormat(pattern = "YYYY-MM-DDhh:mm")
    private String dateTime;

    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lab_result_id")
    private LabResult labResult;

    public Measurement() {
    }

    public Measurement(String measurementId, String LocalDateTime, String value, LabResult labResult) {
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

    public String getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(String measurementId) {
        this.measurementId = measurementId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
