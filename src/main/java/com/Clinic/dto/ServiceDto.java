package com.Clinic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {
    private String serviceId;
    private String serviceName;
    private String serviceCode;
    private String serviceDescription;
    private double averagePrice;
    private boolean isActive;
}
