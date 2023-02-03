package com.project.projectRepositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.projectEmployeepackage.EmployeeEntity;
@Repository
public interface EmployeeRepositary extends JpaRepository<EmployeeEntity, Long> {

}
