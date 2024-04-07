package com.Clinic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClinicDto {
    private String clinicId;
    private String clinicName;
    private String businessName;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private double latitude;
    private double longitude;
    private Date dateCreated;
    private List<ServiceDto> servicesOffered;
}
