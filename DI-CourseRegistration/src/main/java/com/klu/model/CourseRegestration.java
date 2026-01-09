package com.klu.model;

public class CourseRegestration {
	private int rollno;
	private String studentName;
	private String CourseName;
	private int Semester;
	
	public CourseRegestration(int rollno, String studentName) {
		this.rollno=rollno;
		this.studentName=studentName;
		
	}
	public void setCourseName(String CourseName) {
		this.CourseName=CourseName;
		
	}
	public void setSemester(int Semester) {
		this.Semester=Semester;
	}
	
	public void display() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+studentName);
		System.out.println("CourseName:"+CourseName);
		System.out.println("Semester:"+Semester);
	}

}
