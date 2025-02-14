package com.student;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	private static List<Student> studentList;

	public static void main(String[] args) {
		System.out.println("*************Welcome to Student Management System Project Assignment**************");
		studentList = new ArrayList<Student>();

		Student s1;
		Student s2;
		Student s3;
		s1 = new Student("Pramesh", 41, "C001");
		// s1.StudentInformation();
		s1.enrollcourse("Java");
		// s1.enrollcourse("Python");
		// s1.enrollcourse("SQL");
		// s1.enrollcourse("Java");
		// System.out.println(s1);

		System.out.println("*********************************************");

		s2 = new Student("Vedanshi", 11, "C002");
		s2.enrollcourse("Python");
		s2.StudentInformation();

		System.out.println("**********************************************");

		s3 = new Student("Ishu", 8, "C003");
		s3.enrollcourse("Dancing");
		s3.StudentInformation();
		// storing all object data with in list

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		// System.out.print(studentList + " ");

		// finding student by ID..call the method.

		Student result = findStudentbyID("C001");
		System.out.println("serach result by studentId is " + result);

	}

	public static Student findStudentbyID(String studentID) {
		Student result=null;
		
		try {
		result = studentList.stream().filter(x -> x.getStudentID().equalsIgnoreCase(studentID)).findFirst()
				.orElseThrow(() -> new RuntimeException(" No Data Found"));
		}catch(RuntimeException e) {
			System.err.println("StudentID data is not found.");
		}
		return result;

	}

}
