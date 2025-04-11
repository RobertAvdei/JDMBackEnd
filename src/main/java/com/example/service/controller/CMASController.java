package com.example.service.controller;

import com.example.service.model.CMAS;
import com.example.service.model.Patient;
import com.example.service.services.CMASService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = {"http://localhost:5173","http://localhost:3000 "}
)
@RestController
public class CMASController {
    private final CMASService cmasService;

    public CMASController(CMASService cmasService) {
        this.cmasService = cmasService;
    }

    @RequestMapping(
            value = {"/CMAS/patient/{uuid}"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public List<CMAS> getLastPatientAppointment(@PathVariable("uuid") String patientId) {
        return cmasService.getCMASByPatientId(patientId);
    }
}
