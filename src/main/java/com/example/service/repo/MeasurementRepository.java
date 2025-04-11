package com.example.service.repo;

import com.example.service.model.Measurement;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementRepository extends CrudRepository<Measurement, Integer> {
}
