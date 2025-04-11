package com.example.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class LabResultGroup {
    @Id
    @GeneratedValue(
            strategy = GenerationType.UUID
    )
    private String labResultGroupId;

    private String groupName;

    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "labResultGroup")
    private Set<LabResult> labResults;

    public LabResultGroup(){}

    public LabResultGroup(String labResultGroupId, String groupName) {
        this.labResultGroupId = labResultGroupId;
        this.groupName = groupName;
    }

    public LabResultGroup(String labResultGroupId, String groupName, Set<LabResult> labResults) {
        this.labResultGroupId = labResultGroupId;
        this.groupName = groupName;
        this.labResults = labResults;
    }

    public String getLabResultGroupId() {
        return labResultGroupId;
    }

    public void setLabResultGroupId(String labResultGroupId) {
        this.labResultGroupId = labResultGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setLabResults(Set<LabResult> labResults) {
        this.labResults = labResults;
    }
}
