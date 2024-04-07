package com.Clinic.controller;

import com.Clinic.dto.ClinicDto;
import com.Clinic.service.ClinicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clinic")
public class ClinicController {
    private ClinicService clinicService;
//
    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PostMapping
    public ResponseEntity<ClinicDto> addClinic(@RequestBody ClinicDto clinicDto) {
        ClinicDto dto = clinicService.addClinic(clinicDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
