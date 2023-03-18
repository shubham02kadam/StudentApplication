package com.jdc.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable> {

}
