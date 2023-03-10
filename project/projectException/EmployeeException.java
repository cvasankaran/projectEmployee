package com.project.projectException;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class EmployeeException  extends RuntimeException{
	private static final long serialVersionUID= 1l;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	
	public EmployeeException (String resoucesName, String fieldName, Object fieldValue, String resourceName) {
		super( String.format("%s not found with %s: '%s'", resourceName, fieldName, fieldValue));
		 
		this.resourceName= resourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}


	public String getResourceName() {
		return resourceName;
	}


	
	


	public String getFieldName() {
		return fieldName;
	}




	public Object getFieldValue() {
		return fieldValue;
	}


	
	

}
 