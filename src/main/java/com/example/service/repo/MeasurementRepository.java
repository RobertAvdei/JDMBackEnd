package com.example.service.repo;

import com.example.service.model.CMAS;
import com.example.service.model.Measurement;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementRepository extends CrudRepository<Measurement, Integer> {
    interface CMASRepository extends CrudRepository<CMAS, Integer> {

    }
}
