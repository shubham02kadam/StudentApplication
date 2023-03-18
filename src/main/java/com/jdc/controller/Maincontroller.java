package com.jdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.Service.ServiceI;
import com.jdc.entity.Student;

@RestController
public class Maincontroller {
	
	@Autowired
	private ServiceI ser;
	
	@PostMapping("/sa")
	public ResponseEntity<Student>addStudent(Student stud){
		
		Student addstudent = ser.addstudent(stud);
		return new ResponseEntity<>(addstudent,HttpStatus.CREATED);
		
		
	}

}
