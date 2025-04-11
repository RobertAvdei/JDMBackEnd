package com.example.service.controller;

import com.example.service.model.LabResult;
import com.example.service.services.LabResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = {"http://localhost:5173","http://localhost:3000 "}
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

    @RequestMapping(
            value = {"/labResults/patient/{uuid}"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public  List<LabResult>  getLastPatientAppointment(@PathVariable("uuid") String patientId) {
        return labResultService.getLabResultByPatientId(patientId);
    }


}
