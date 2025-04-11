package com.example.service.repo;

import com.example.service.model.CMAS;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CMASRepository extends CrudRepository<CMAS, Integer> {
    CMAS findAllByPatientId(String PatientId);
}
