package com.example.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class LabResult {

    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private UUID labResultId;

    private String resultName;

    private String unit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lab_result_group_id")
    private LabResultGroup labResultGroup;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "labResult", fetch = FetchType.LAZY)
    private Set<Measurement> measurements;

    public LabResult() {
    }

    public LabResult(UUID labResultId, String resultName, String unit, Patient patient, LabResultGroup labResultGroup, Set<Measurement> measurements) {
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

    public UUID getLabResultId() {
        return labResultId;
    }

    public void setLabResultId(UUID labResultId) {
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
