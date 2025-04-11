package com.example.service.services;

import com.example.service.model.CMAS;
import com.example.service.repo.CMASRepository;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMASService {
    private final CMASRepository cmasRepository;

    public CMASService(CMASRepository cmasRepository) {
        this.cmasRepository = cmasRepository;
    }

    public List<CMAS> getCMASByPatientId(String patientId) {
        return Lists.newArrayList(cmasRepository.findAllByPatientId(patientId));
    }

}
