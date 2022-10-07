package com.College.comman;

import com.College.Entity.CollegeEntity;

public class StudentResponse {
	private CollegeEntity collegeEntity ;
	private String  student_name;
	private String gender;
	private int age;
	
	
	
	public StudentResponse(int id, String name, String gender2, int age2) {
		// TODO Auto-generated constructor stub
	}
	
	public StudentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeEntity getCollegeEntity() {
		return collegeEntity;
	}
	public void setCollegeEntity(CollegeEntity collegeEntity) {
		this.collegeEntity = collegeEntity;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
