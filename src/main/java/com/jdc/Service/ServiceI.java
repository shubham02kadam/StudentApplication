package com.jdc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.Repository.StudentRepo;
import com.jdc.entity.Student;

@Service
public class ServiceI {
	
	@Autowired
	private StudentRepo repo;
	
	public Student addstudent(Student stud) {
		
		Student save = repo.save(stud);
		return save;
	}

}
