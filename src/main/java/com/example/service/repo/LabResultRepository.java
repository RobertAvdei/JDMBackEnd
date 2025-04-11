package com.example.service.repo;

import com.example.service.model.LabResult;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LabResultRepository extends CrudRepository<LabResult, Integer> {
    List<LabResult> findBypatientPatientId(String patientId);
}
