package com.Clinic.repository;

import com.Clinic.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRespository extends JpaRepository<Clinic, Long> {
}
