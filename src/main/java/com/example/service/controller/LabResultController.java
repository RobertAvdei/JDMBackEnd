package com.example.service.controller;

import com.example.service.model.LabResult;
import com.example.service.services.LabResultService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(
        origins = {"http://localhost:5173"}
)
@RestController
public class LabResultController {
    private final LabResultService labResultService;

    public LabResultController(final LabResultService labResultService) {
        this.labResultService = labResultService;
    }

    @RequestMapping(
            value = {"/labResults"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public List<LabResult> getPatients() {
        return labResultService.getAllLabResults();
    }


}
