package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {
	@Value("101")
	private int rollno;
	@Value("Anusha")
	private String studentName;
	@Value("FSAD")
	private String courseName;
	@Value("4")
	private int Semester;
	public CourseRegistration(int no, String name, String cn, int sem) {
		rollno=no;
		studentName=name;
		courseName=cn;
		Semester=sem;
	}
	public void display() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Nmae:"+studentName);
		System.out.println("CourseName:"+courseName);
		System.out.println("semeste:"+Semester);
	}

}
