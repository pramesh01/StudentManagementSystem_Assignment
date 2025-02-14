package com.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int age;
	private String studentID;
	private List<String> courses;
	
	public Student(String name,int age,String studentID) {
		super();
		this.name=name;
		this.age=age; 
		this.studentID=studentID;
		courses=new ArrayList<String>();// initialization of courses
	   }
	
	public void enrollcourse(String studentCourse) {
		if(!courses.contains(studentCourse)) {
			courses.add(studentCourse);
			System.out.println("Student is Registered for course "+studentCourse);
		}else {
			System.err.println("Student already registered for the course.."+studentCourse);
		}
	}
	// getters for student id.
	public String getStudentID() {
		return studentID;
	}

	public void StudentInformation() {
		System.out.println("***************printing student information*****************");
		System.out.println("name of student is "+name);
		System.out.println("Age of student is "+age);
		System.out.println("studentID of student is "+studentID);
		System.out.println("courses enrolled for student is "+courses);
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", courses=" + courses + "]";
	}
	
}
