package com.jdc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studId;
	private String studName;
	private String studEmail;
	private String studMob;
	
	public Student() {
		super();
		
	}

	public Student(Integer studId, String studName, String studEmail, String studMob) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studMob = studMob;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudMob() {
		return studMob;
	}

	public void setStudMob(String studMob) {
		this.studMob = studMob;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studEmail=" + studEmail + ", studMob="
				+ studMob + "]";
	}
	

}
