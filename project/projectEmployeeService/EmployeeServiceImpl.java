package com.project.projectEmployeeService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.projectEmployeepackage.EmployeeEntity;
import com.project.projectRepositary.EmployeeRepositary;

@Service
public  class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepositary employeeRepositary;
	
	public EmployeeServiceImpl (EmployeeRepositary employeeRepositary);
	super();
	this.employeeRepositary =employeeRepositary;
	

}
public EmployeeEntity saveEmployeeEntity(EmployeeEntity employee) {
	return EmployeeRepositary.save(employee);
}
@Override
public List<EmployeeEntity> getAllEmployees(){
	return EmployeeRepositary.findAll();
	
} 
 @Override
 public EmployeeEntity getEmployeeById(int id) {
	 
 } 
 return EmployeeRepositary.findById(id.orElse)