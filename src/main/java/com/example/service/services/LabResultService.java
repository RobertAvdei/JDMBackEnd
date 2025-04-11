package com.example.service.services;

import com.google.common.collect.*;
import com.example.service.model.LabResult;
import com.example.service.repo.LabResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabResultService {

    private final LabResultRepository labResultRepository;

    public LabResultService(final LabResultRepository labResultRepository) {
        this.labResultRepository = labResultRepository;
    }

    public List<LabResult> getAllLabResults() {
        return Lists.newArrayList(labResultRepository.findAll()) ;
    }

}
