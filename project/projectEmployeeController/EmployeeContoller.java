package com.project.projectEmployeeController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.projectEmployeeService.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeContoller {
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService= employeeService;
				
			
	}
	@PostMapping()
	public ResponseEntity <EmployeeEntity> saveEmployeeEntity(@RequestBody EmployeeEntity employee){
		return new ResponseEntity<EmployeeEntity>(EmployeeService.saveEmployeeEntity(employee), )
	}
	

}
