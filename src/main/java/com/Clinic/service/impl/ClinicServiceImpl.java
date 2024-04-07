package com.Clinic.service.impl;

import com.Clinic.dto.ClinicDto;
import com.Clinic.entity.Clinic;
import com.Clinic.repository.ClinicRespository;
import com.Clinic.service.ClinicService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceImpl implements ClinicService {
    private ClinicRespository clinicRespository;

    private ModelMapper modelMapper;


    public ClinicServiceImpl(ClinicRespository clinicRespository, ModelMapper modelMapper) {
        this.clinicRespository = clinicRespository;
        this.modelMapper = modelMapper;
    }

    Clinic mapToEntity(ClinicDto clinicDto) {
        Clinic clinic = modelMapper.map(clinicDto, Clinic.class);
        return clinic;
    }

    ClinicDto mapToDto(Clinic clinic) {
        ClinicDto dto = modelMapper.map(clinic, ClinicDto.class);
        return dto;
    }

    @Override
    public ClinicDto addClinic(ClinicDto clinicDto) {
        Clinic clinic = mapToEntity(clinicDto);
        Clinic saveClinic = clinicRespository.save(clinic);
        ClinicDto dto = mapToDto(saveClinic);
        return dto;
    }
}
