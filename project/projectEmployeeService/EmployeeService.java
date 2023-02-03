package com.project.projectEmployeeService;

import java.util.List;

import com.project.projectEmployeepackage.EmployeeEntity;

public interface EmployeeService {
	EmployeeEntity saveEmployeeEntity(EmployeeEntity employee);
	List<EmployeeEntity> getAllEmployees();
	EmployeeEntity getEmployeeById(int id);
	EmployeeEntity updateEmployeeentity(EmployeeEntity employee,int id);
	void deleteEmployeeEntity(int id);

}
