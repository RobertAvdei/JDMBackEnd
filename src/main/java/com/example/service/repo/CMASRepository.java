package com.example.service.repo;

import com.example.service.model.CMAS;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CMASRepository extends CrudRepository<CMAS, Integer> {
    List<CMAS> findAllByPatientId(String PatientId);
}
