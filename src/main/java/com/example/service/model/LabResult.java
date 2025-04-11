package com.example.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;


@Entity
public class LabResult {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String labResultId;

    private String resultName;

    private String unit;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "lab_result_group_id")
    private LabResultGroup labResultGroup;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "labResult", fetch = FetchType.LAZY)
    private Set<Measurement> measurements;

    public LabResult() {
    }

    public LabResult(String labResultId, String resultName, String unit, Patient patient, LabResultGroup labResultGroup, Set<Measurement> measurements) {
        this.labResultId = labResultId;
        this.resultName = resultName;
        this.unit = unit;
        this.patient = patient;
        this.labResultGroup = labResultGroup;
        this.measurements = measurements;
    }

    public Set<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(Set<Measurement> measurements) {
        this.measurements = measurements;
    }

    public String getLabResultId() {
        return labResultId;
    }

    public void setLabResultId(String labResultId) {
        this.labResultId = labResultId;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LabResultGroup getLabResultGroup() {
        return labResultGroup;
    }

    public void setLabResultGroup(LabResultGroup labResultGroup) {
        this.labResultGroup = labResultGroup;
    }
}
